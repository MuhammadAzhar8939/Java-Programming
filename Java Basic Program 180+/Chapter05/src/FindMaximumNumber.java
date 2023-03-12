import java.util.Scanner;

public class FindMaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your first number...!");
        int n1 = input.nextInt();
        System.out.println("Enter Your second number...!");
        int n2 = input.nextInt();
        System.out.println("Enter Your third number...!");
        int n3 = input.nextInt();
        int max=n1;
        input.close();
        if (n2>max) {
           max=n2;
        }
        if (n3>max) {
            max=n3;
        }
        System.out.println("Maximum Number is : "+max);
    }
}
