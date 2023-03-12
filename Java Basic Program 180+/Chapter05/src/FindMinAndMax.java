import java.util.Scanner;

public class FindMinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your first number...!");
        int n1 = input.nextInt();
        System.out.println("Enter Your second number...!");
        int n2 = input.nextInt();
        System.out.println("Enter Your third number...!");
        int n3 = input.nextInt();
        System.out.println("Enter Your fourth number...!");
        int n4 = input.nextInt();
        System.out.println("Enter Your fifth number...!");
        int n5 = input.nextInt();
        int max=n1;
        int min=n1;
        input.close();
        // maximum 
        if (n2>max) {
           max=n2;
        }
        if (n3>max) {
            max=n3;
        }
        if (n4>max) {
           max=n4;
        }
        if (n5>max) {
            max=n5;
        }
        //minimum
        if (n2<min) {
           min=n2;
        }
        if (n3<min) {
            min=n3;
        }
        if (n4<min) {
           min=n4;
        }
        if (n5<min) {
            min=n5;
        }
        System.out.println("Maximum Number is : "+max);
        System.out.println("Minimum Number is : "+min);
    }
}
