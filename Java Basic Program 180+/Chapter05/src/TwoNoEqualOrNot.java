import java.util.Scanner;

public class TwoNoEqualOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your first number...!");
        int no1 = input.nextInt();
        System.out.println("Enter Your second number...!");
        int no2 = input.nextInt();
        input.close();
        if (no1 == no2) {
            System.out.println("Congratulations...! Numbers are Equal");
        }
    }
}
