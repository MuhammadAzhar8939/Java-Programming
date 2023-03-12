import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter Integer To Store in Two Dimentional Array ");
                arr[i][j] = input.nextInt();
            }
        }
        input.close();
        //array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
        //diagonal sum
        int diagonalSum = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <4; j++) {
                    if (i == j) {
                        diagonalSum = diagonalSum + arr[i][j];
                    }
                }
            }
            System.out.println("\nDiagonal Sum is : " + diagonalSum);
    }
}
