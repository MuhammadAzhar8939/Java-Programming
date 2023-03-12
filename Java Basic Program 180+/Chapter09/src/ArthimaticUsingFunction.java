import java.util.Scanner;

public class ArthimaticUsingFunction {
    static void calculate(int a, int b, char op) {
        switch (op) {
            case '+':
                System.out.println("The Result is : " + (a + b));
                break;
            case '-':
                System.out.println("The Result is : " + (a - b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by 0");
                } else {
                    System.out.println("The Result is : " + ((double) a / (double) b));

                }
                break;
            case '*':
                System.out.println("The Result is : " + (a * b));
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number ");
        int no1 = input.nextInt();
        System.out.println("Enter Operator (+,-,/,*) ");
        char op = input.next().charAt(0);
        System.out.println("Enter Second Number ");
        int no2 = input.nextInt();
        calculate(no1, no2, op);
        input.close();
    }
}
