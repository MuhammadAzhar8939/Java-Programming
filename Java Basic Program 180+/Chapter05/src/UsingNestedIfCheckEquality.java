import java.util.Scanner;

public class UsingNestedIfCheckEquality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your first number...!");
        int n1 = input.nextInt();
        System.out.println("Enter Your second number...!");
        int n2 = input.nextInt();
        System.out.println("Enter Your third number...!");
        int n3 = input.nextInt();
        input.close();
        if (n1 == n2) {
            if (n1 == n3) {
                System.out.println("Yes, Numbers are Equal");
            } else {
                System.out.println("No, Numbers are not Equal");
            }
        } else {
            System.out.println("No, Numbers are not Equal");
        }
    }
}
