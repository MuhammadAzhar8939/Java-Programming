import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImageViewerUI extends JPanel {
    private JButton openButton;
    private JButton nextButton;
    private JButton previousButton;
    private JButton zoomInButton;
    private JButton zoomOutButton;
    private JLabel imageLabel;
    private JLabel infoLabel;
    private List<String> imagePaths;
    private int currentImageIndex;

    public ImageViewerUI() {

        setLayout(null);
        Color buttonColor=Color.decode("#212A3E");

        openButton = new JButton("Open");
        openButton.setBounds(10, 530, 80, 30);
        openButton.setFocusable(false);
        openButton.setBorderPainted(false);
        openButton.setForeground(Color.white);
        openButton.setBackground(buttonColor);
        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });
        add(openButton);

        nextButton = new JButton("Next");
                nextButton.setFocusable(false);
        nextButton.setBorderPainted(false);
        nextButton.setForeground(Color.white);
        nextButton.setBackground(buttonColor);
        nextButton.setBounds(100, 530, 80, 30);
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                navigateNext();
            }
        });
        add(nextButton);

        previousButton = new JButton("Previous");
                previousButton.setFocusable(false);
        previousButton.setBorderPainted(false);
        previousButton.setForeground(Color.white);
        previousButton.setBackground(buttonColor);
        previousButton.setBounds(190, 530, 100, 30);
        previousButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                navigatePrevious();
            }
        });
        add(previousButton);

        zoomInButton = new JButton("Zoom In");
                zoomInButton.setFocusable(false);
        zoomInButton.setBorderPainted(false);
        zoomInButton.setForeground(Color.white);
        zoomInButton.setBackground(buttonColor);
        zoomInButton.setBounds(300, 530, 100, 30);
        zoomInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                zoomIn();
            }
        });
        add(zoomInButton);

        zoomOutButton = new JButton("Zoom Out");
                zoomOutButton.setFocusable(false);
        zoomOutButton.setBorderPainted(false);
        zoomOutButton.setForeground(Color.white);
        zoomOutButton.setBackground(buttonColor);
        zoomOutButton.setBounds(410, 530, 100, 30);
        zoomOutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                zoomOut();
            }
        });
        add(zoomOutButton);

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setVerticalAlignment(JLabel.CENTER);
        imageLabel.setBounds(0, 0, 500, 500);
        imageLabel.setLayout(null);
        // add(imageLabel);

        infoLabel = new JLabel();
        infoLabel.setForeground(Color.white);
        infoLabel.setBounds(10, 500, 480, 20);
        add(infoLabel);

        imagePaths = new ArrayList<>();
        currentImageIndex = -1;

        // Create a JPanel to hold the components
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setBackground(Color.decode("#F1F6F9"));

        // Add the imageLabel to the contentPanel
        contentPanel.add(imageLabel, BorderLayout.CENTER);

        // Create a JScrollPane and set the contentPanel as its viewport view
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBounds(0, 0, 550, 500);
        add(scrollPane);

    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            public boolean accept(File file) {
                return file.isDirectory() || file.getName().toLowerCase().endsWith(".jpg")
                        || file.getName().toLowerCase().endsWith(".png");
            }

            public String getDescription() {
                return "Image Files (*.jpg, *.png)";
            }
        });

        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File[] selectedFiles = fileChooser.getSelectedFiles();
            if (selectedFiles.length > 0) {
                imagePaths.clear();
                currentImageIndex = -1;
                for (File file : selectedFiles) {
                    imagePaths.add(file.getAbsolutePath());
                }
                navigateNext();
            }
        }
    }

    private void loadImage() {
        if (currentImageIndex >= 0 && currentImageIndex < imagePaths.size()) {
            try {
                String imagePath = imagePaths.get(currentImageIndex);
                Image image = ImageIO.read(new File(imagePath));
                ImageIcon imageIcon = new ImageIcon(image);

                // Calculate the scaled width and height while maintaining aspect ratio
                int panelWidth = imageLabel.getWidth();
                int panelHeight = imageLabel.getHeight();

                double aspectRatio = (double) imageIcon.getIconWidth() / imageIcon.getIconHeight();
                int scaledWidth = panelWidth;
                int scaledHeight = (int) (scaledWidth / aspectRatio);

                if (scaledHeight > panelHeight) {
                    scaledHeight = panelHeight;
                    scaledWidth = (int) (scaledHeight * aspectRatio);
                }

                // Scale the loaded image to fit within the label while maintaining aspect ratio
                Image scaledImage = image.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
                imageIcon = new ImageIcon(scaledImage);

                imageLabel.setIcon(imageIcon);

                // Calculate the position to center the image within the label
                int x = (panelWidth - scaledWidth) / 2;
                int y = (panelHeight - scaledHeight) / 2;

                // Update the size and position of the imageLabel
                imageLabel.setBounds(x, y, scaledWidth, scaledHeight);

                // Display image information
                File imageFile = new File(imagePath);
                String imageName = imageFile.getName();
                String imageSize = String.format("%.2f KB", imageFile.length() / 1024.0);
                String imageInfo = "Name: " + imageName + "    Size: " + imageSize;
                infoLabel.setText(imageInfo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            imageLabel.setIcon(null);
            infoLabel.setText("");
        }
    }

    private void navigateNext() {
        if (!imagePaths.isEmpty()) {
            if (currentImageIndex + 1 < imagePaths.size()) {
                currentImageIndex++;
            } else {
                JOptionPane.showMessageDialog(this, "No more images available.", "Image Viewer",
                        JOptionPane.INFORMATION_MESSAGE);
                currentImageIndex = 0;
            }
            loadImage();
            centerImageLabel();
        }
    }

    private void navigatePrevious() {
        if (!imagePaths.isEmpty()) {
            if (currentImageIndex - 1 >= 0) {
                currentImageIndex--;
            } else {
                JOptionPane.showMessageDialog(this, "No previous images available.", "Image Viewer",
                        JOptionPane.INFORMATION_MESSAGE);
                currentImageIndex = imagePaths.size() - 1;
            }
            loadImage();
            centerImageLabel();
        }
    }

    private static final double ZOOM_IN_FACTOR = 2.0;
    private static final double ZOOM_OUT_FACTOR = 0.5;

    private static final int MAX_ZOOM_COUNT = 3;
    private int zoomCount = 0;

    private void zoomIn() {
        if (zoomCount < MAX_ZOOM_COUNT) {
            int panelWidth = imageLabel.getWidth();
            int panelHeight = imageLabel.getHeight();

            int newWidth = (int) (panelWidth * ZOOM_IN_FACTOR);
            int newHeight = (int) (panelHeight * ZOOM_IN_FACTOR);

            imageLabel.setSize(newWidth, newHeight);
            loadImage();
            centerImageLabel();

            zoomCount++;
        } else {
            JOptionPane.showMessageDialog(this, "Maximum zoom level reached.", "Image Viewer",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void zoomOut() {
        if (zoomCount > 0) {
            int panelWidth = imageLabel.getWidth();
            int panelHeight = imageLabel.getHeight();

            int newWidth = (int) (panelWidth * ZOOM_OUT_FACTOR);
            int newHeight = (int) (panelHeight * ZOOM_OUT_FACTOR);

            imageLabel.setSize(newWidth, newHeight);
            loadImage();
            centerImageLabel();

            zoomCount--;
        } else {
            JOptionPane.showMessageDialog(this, "Minimum zoom level reached.", "Image Viewer",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void centerImageLabel() {
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        int labelWidth = imageLabel.getWidth();
        int labelHeight = imageLabel.getHeight();

        int x = (panelWidth - labelWidth) / 2;
        int y = (panelHeight - labelHeight) / 2;

        imageLabel.setLocation(x, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.decode("#474E68"));
        ImageViewerUI viewerUI = new ImageViewerUI();
        frame.setContentPane(viewerUI);
        viewerUI.setBackground(Color.decode("#474E68"));

        // Set the size of the frame
        int frameWidth = 550;
        int frameHeight = 650; // Increased the frame height to accommodate the buttons
        frame.setSize(frameWidth, frameHeight);

        // Center the frame on the screen
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int x = (screenWidth - frameWidth) / 2;
        int y = (screenHeight - frameHeight) / 2;
        frame.setLocation(x, y);

        frame.setVisible(true);
    }
}
