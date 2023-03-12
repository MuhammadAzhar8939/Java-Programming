import java.util.Scanner;

public class DisplaMaximumInArray {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Number to Store in Array");
            arr[i]=input.nextInt();
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("The Maximum Number is : "+max);
        input.close();
    }
}
