import java.util.Scanner;

public class SumOfSquareAndCube {
    static int square(int n) {
        return n*n;
    }
    static int cube(int n) {
        return n*n*n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number ");
        int no1 = input.nextInt();
        System.out.println("Enter Second Number ");
        int no2 = input.nextInt();
        input.close();
        System.out.println("The Sum of square of first and cube of second number is : "+(square(no1)+cube(no2)));
    }
}
 