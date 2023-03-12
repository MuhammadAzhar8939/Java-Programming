import java.util.Scanner;

public class FunctionOverloadingWithArray {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Number to store in Array ");
            arr[i] = inpScanner.nextInt();
        }
        inpScanner.close();

        System.out.println("\nFunction Call with Single Parameter ");
        Sum(arr);
        System.out.println("\nFunction Call With E Parameter ");
        Sum(arr, 'E');
        System.out.println("\nFunction Call With O Parameter ");
        Sum(arr, 'O');

    }

    public static void Sum(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("The Sum Of All Element Of Array Is : " + sum);
    }

    public static void Sum(int[] num, char ch) {
        if (ch == 'E') {
            int sum = 0;
            for (int i = 0; i < num.length; i++) {
                if (num[i] % 2 == 0) {
                    sum = sum + num[i];
                }
            }
            System.out.println("The Sum Of All Element Of Array Is : " + sum);
        } else if (ch == 'O') {
            int sum = 0;
            for (int i = 0; i < num.length; i++) {
                if (num[i]%2!=0) {
                    sum = sum + num[i];                    
                }
            }
            System.out.println("The Sum Of All Element Of Array Is : " + sum);
        }

    }
}
