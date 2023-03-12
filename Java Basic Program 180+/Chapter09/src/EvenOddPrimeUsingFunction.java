import java.util.Scanner;

public class EvenOddPrimeUsingFunction {
    static void NumberChecker(int a) {
        int prime = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                prime = 1;
            }
        }
        if (a % 2 == 0 && prime == 0) {
            System.out.println("The Number is Even Prime");
        } else if (a % 2 == 0 && prime == 1) {
            System.out.println("The Number is Only Even, Not Prime");
        } else if (a % 2 != 0 && prime == 0) {
            System.out.println("The Number is Odd Prime");
        } else if (a % 2 != 0 && prime == 1) {
            System.out.println("The Number is Only Odd, Not Prime");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number To Check Even, Odd and Prime ");
        int no1 = input.nextInt();
        System.out.println("Nature Of Number is ");
        NumberChecker(no1);
        input.close();
    }
}
