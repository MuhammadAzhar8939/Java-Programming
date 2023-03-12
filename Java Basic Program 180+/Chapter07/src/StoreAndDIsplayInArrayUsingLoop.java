import java.util.Scanner;

public class StoreAndDIsplayInArrayUsingLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Integer To Store In array ...");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
        input.close();
    }
}
