import java.util.Scanner;

public class StoreAndDisplayValuesFromArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter First Integer To Store In array ...");
        arr[0]=input.nextInt();
        System.out.println("Enter Second Integer To Store In array ...");
        arr[1]=input.nextInt();
        System.out.println("Enter Third Integer To Store In array ...");
        arr[2]=input.nextInt();
        System.out.println("Enter fourth Integer To Store In array ...");
        arr[3]=input.nextInt();
        System.out.println("Enter fifth Integer To Store In array ...");
        arr[4]=input.nextInt();
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        input.close();
    }
}
