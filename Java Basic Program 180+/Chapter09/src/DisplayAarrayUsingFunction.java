import java.util.Scanner;

public class DisplayAarrayUsingFunction {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter Integer To Store in Array ");
            array[i] = inpScanner.nextInt();
        }
        inpScanner.close();
        Display(array);
    }
    public static void Display(int[] arr){
        System.out.println("Printing Values Of Array .");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
}
