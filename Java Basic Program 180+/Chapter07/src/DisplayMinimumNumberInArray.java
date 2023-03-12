import java.util.Scanner;

public class DisplayMinimumNumberInArray {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Number to Store in Array");
            arr[i]=input.nextInt();
        }
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println("The Minimum Number is : "+min);
        input.close();
    }
}
