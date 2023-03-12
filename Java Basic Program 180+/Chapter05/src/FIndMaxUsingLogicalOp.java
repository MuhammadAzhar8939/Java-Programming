import java.util.Scanner;

public class FIndMaxUsingLogicalOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your first number...!");
        int n1 = input.nextInt();
        System.out.println("Enter Your second number...!");
        int n2 = input.nextInt();
        System.out.println("Enter Your third number...!");
        int n3 = input.nextInt();
        input.close();
        if (n1 > n2 && n1 > n3) {
            System.out.println("The Maximum number is : " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("The Maximum number is : " + n2);
        } else {
            System.out.println("The Maximum number is : " + n3);
        }
    }
}
