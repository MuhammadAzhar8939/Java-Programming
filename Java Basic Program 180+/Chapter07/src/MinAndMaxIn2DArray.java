import java.util.Scanner;

public class MinAndMaxIn2DArray {
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
        int min=arr[0][0];
        int max=arr[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[i][j]>max) {
                    max=arr[i][j];
                } else if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("The Maximum is : "+max);
        System.out.println("The Minimum is : "+min);
    }
}
