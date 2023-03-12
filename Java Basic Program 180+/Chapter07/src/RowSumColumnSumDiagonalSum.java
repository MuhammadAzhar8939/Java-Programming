import java.util.Scanner;

public class RowSumColumnSumDiagonalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Of Rows For Matrix");
        int rows = input.nextInt();
        System.out.println("Enter Number Of Colums For Matrix");
        int columns = input.nextInt();
        int[][] arr = new int[rows + 1][columns + 1];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter Integer To Store in Two Dimentional Array ");
                arr[i][j] = input.nextInt();
            }
        }
        input.close();
        // rows sum
        for (int i = 0; i < rows; i++) {
            arr[i][columns] = 0;
            for (int j = 0; j < columns; j++) {
                arr[i][columns] = arr[i][columns] + arr[i][j];
            }
        }
        for (int i = 0; i < columns; i++) {
            arr[rows][i] = 0;
            for (int j = 0; j < rows; j++) {
                arr[rows][i] = arr[rows][i] + arr[j][i];
            }
        }
        for (int i = 0; i < rows + 1; i++) {
            for (int j = 0; j < columns + 1; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
        // diagonal sum
        if (rows == columns) {

            int diagonalSum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (i == j) {
                        diagonalSum = diagonalSum + arr[i][j];
                    }
                }
            }
            System.out.println("\nDiagonal Sum is : " + diagonalSum);
        }
    }
}
