import java.util.Scanner;

public class StoreValuesInTwoRowsFourColumn {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] arr=new int[2][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter Integer To Store in Two Dimentional Array ");
                arr[i][j]=input.nextInt();
            }
        }
        input.close();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
