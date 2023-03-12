import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];
        int[][] sum = new int[2][2];
        System.out.println("\n\n****\t****Enter Integer To Store in First Two Dimentional Array \t****\t****\n");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Enter Integer");
                arr1[i][j] = input.nextInt();
            }
        }
        System.out.println("\n\n****\t****Enter Integer To Store in Second Two Dimentional Array \t****\t****\n");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Enter Integer");
                arr2[i][j] = input.nextInt();
            }
        }

        input.close();
        // adding matrixs
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
            System.out.println("");
        }
        System.out.println("\n\n****\t****Sum of Two Dimentional Array \t****\t****\n");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
