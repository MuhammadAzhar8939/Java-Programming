import java.util.Scanner;

public class CheckNoIsPositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your number...!");
        int n1 = input.nextInt();
        input.close();
        if (n1>0) {
            System.out.println("\tNumber is Positive ");
        }
        if (n1<0) {
            System.out.println("\tNumber is Negative ");
        }
        if (n1==0) {
            System.out.println("\tNumber is Zero ");
        }
    }
}
