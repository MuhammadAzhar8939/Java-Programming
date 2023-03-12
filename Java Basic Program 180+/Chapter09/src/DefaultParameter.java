import java.util.Scanner;

public class DefaultParameter {

    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter Positive/Negative Integer To Store in Array ");
            array[i] = inpScanner.nextInt();
        }
        inpScanner.close();
        // int sum=Display(array,c);//as java dos'nt support default parameter so i have
        // used function overloading method
        int sum = Display(array);
        System.out.println("Calling Function Without Operator : " + sum);
        int sum1 = Display(array, '-');
        System.out.println("Calling Function With Operator : " + sum1);
    }

    public static int Display(int[] arr, char c) {
        int NegativeSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                NegativeSum = NegativeSum + arr[i];
            }
        }
        return NegativeSum;
    }
    public static int Display(int[] arr) {
        int PositiveSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                PositiveSum = PositiveSum + arr[i];
            }
        }
        return PositiveSum;
    }
}
