import java.util.Scanner;

public class MaximumFinderIn2DArray {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        int[][] array = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                
                System.out.println("Enter Integer To Store in Array ");
                array[i][j] = inpScanner.nextInt();
            }
        }
        inpScanner.close();
       int max= Maximum(array);
       System.out.println("The Maximum Number is : "+max);
    }
    public static int Maximum(int[][] arr){
        int max=arr[0][0];
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 2; j++) {
                if (max<arr[i][j]) {
                   max=arr[i][j] ;
                }
            }
        }
        return max;

    }
}
