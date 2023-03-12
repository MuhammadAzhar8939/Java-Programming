import java.util.Scanner;

public class SumAndAvgOfStoreValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum=0,avg=0;
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Integer To Store In array ...");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("The Sum Of Entered Values Is : "+sum);
        avg=sum/arr.length;
        System.out.println("The Average Of Entered Values Is : "+avg);
        input.close();
    }
}
