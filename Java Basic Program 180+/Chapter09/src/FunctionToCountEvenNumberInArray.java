import java.util.Scanner;

public class FunctionToCountEvenNumberInArray {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter Integer To Store in Array ");
            array[i] = inpScanner.nextInt();
        }
        inpScanner.close();
        int ECount=Display(array);
        System.out.println("There are "+ECount+" Even Number in Array");
    }

    public static int Display(int[] arr) {
        int EvenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                EvenCount++;
            }
        }
        return EvenCount;
    }
}
