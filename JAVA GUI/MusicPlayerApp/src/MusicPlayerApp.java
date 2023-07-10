import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MusicPlayerApp extends JFrame {
    private JButton playButton;
    private JButton pauseButton;
    private JButton stopButton;
    private JButton chooseFileButton;
    private JLabel trackLabel;
    private JLabel filePathLabel;
    private Clip clip;
    private boolean isPaused;
    private long clipPosition;
    private JFileChooser fileChooser;
    private String audioFilePath;

    public MusicPlayerApp() {
        Color buttonColor = Color.decode("#041C32");
        setTitle("Music Player");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Use custom layout (null layout)
        this.getContentPane().setBackground(Color.decode("#04293A"));

        playButton = new JButton("Play");

        playButton.setForeground(Color.WHITE);
        playButton.setBackground(buttonColor);
        playButton.setFocusPainted(false);
        playButton.setOpaque(true);
        playButton.setBorderPainted(false);
        pauseButton = new JButton("Pause");
        pauseButton.setForeground(Color.WHITE);
        pauseButton.setBackground(buttonColor);
        pauseButton.setFocusPainted(false);
        pauseButton.setOpaque(true);
        pauseButton.setBorderPainted(false);
        stopButton = new JButton("Stop");
        stopButton.setForeground(Color.WHITE);
        stopButton.setBackground(buttonColor);
        stopButton.setFocusPainted(false);
        stopButton.setOpaque(true);
        stopButton.setBorderPainted(false);

        chooseFileButton = new JButton("Choose File");
        chooseFileButton.setForeground(Color.WHITE);
        chooseFileButton.setBackground(buttonColor);
        chooseFileButton.setFocusPainted(false);
        chooseFileButton.setOpaque(true);
        chooseFileButton.setBorderPainted(false);

        trackLabel = new JLabel("Currently Playing: ");
        trackLabel.setForeground(Color.WHITE);
        filePathLabel = new JLabel("Current File Path: ");
        filePathLabel.setForeground(Color.WHITE);

        playButton.setBounds(100, 100, 120, 30);
        pauseButton.setBounds(100, 150, 120, 30);
        stopButton.setBounds(100, 200, 120, 30);
        chooseFileButton.setBounds(100, 250, 120, 30);
        trackLabel.setBounds(100, 300, 200, 30);
        filePathLabel.setBounds(100, 30, 400, 30);

        add(playButton);
        add(pauseButton);
        add(stopButton);
        add(chooseFileButton);
        add(trackLabel);
        add(filePathLabel);
        setSize(500, 500);
        setVisible(true);

        // Initialize the clip
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }

        // Button actions
        playButton.addActionListener(e -> play());
        pauseButton.addActionListener(e -> pause());
        stopButton.addActionListener(e -> stop());
        chooseFileButton.addActionListener(e -> chooseFile());

        // Initialize the file chooser
        fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    }

    // Play the audio file
    private void play() {
        if (clip != null && !clip.isActive() && !isPaused) {
            if (audioFilePath == null || audioFilePath.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please choose an audio file.", "No File Selected",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            try {
                File audioFile = new File(audioFilePath);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                AudioFormat baseFormat = audioStream.getFormat();
                AudioFormat targetFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED,
                        baseFormat.getSampleRate(), 16, 1, 2, baseFormat.getSampleRate(), false);

                AudioInputStream convertedStream = AudioSystem.getAudioInputStream(targetFormat, audioStream);

                clip.open(convertedStream);
                clip.start();
                updateTrackLabel("Playing...");
            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                ex.printStackTrace();
            }
        } else if (clip != null && isPaused) {
            clip.setMicrosecondPosition(clipPosition);
            clip.start();
            updateTrackLabel("Playing...");
            isPaused = false;
        } else if (clip != null && clip.isActive()) {
            clip.stop();
            clip.close();
            clipPosition = 0; // Reset the position to the beginning
            clip.setFramePosition(0);
            play();
        }
    }

    // Pause the audio playback
    private void pause() {
        if (clip != null && clip.isRunning()) {
            clipPosition = clip.getMicrosecondPosition(); // Store the current position
            clip.stop();
            updateTrackLabel("Paused");
            isPaused = true;
        }
    }

    // Stop the audio playback
    private void stop() {
        if (clip != null && (clip.isRunning() || clip.isActive())) {
            clip.stop();
            clip.close();
            clipPosition = 0; // Reset the position to the beginning
            clip.setFramePosition(0);
            updateTrackLabel("Stopped");
            isPaused = false;
        }
    }

    // Choose the audio file
    private void chooseFile() {
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            audioFilePath = selectedFile.getAbsolutePath();
            
            filePathLabel.setText("Current File Path: " + selectedFile.getName());
        }
    }

    // Update the track label with the given text
    private void updateTrackLabel(String text) {
        trackLabel.setText("Currently Playing: " + text);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MusicPlayerApp());
    }
}
