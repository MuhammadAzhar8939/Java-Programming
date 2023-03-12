import java.util.Scanner;

public class FindIfSecondNoIsMultipleOfFirst {
    static int multiple(int a, int b) {

        if (b % a == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //for loop to test five numbers
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter First Number ");
            int no1 = input.nextInt();
            System.out.println("Enter Second Number ");
            int no2 = input.nextInt();
            int result = multiple(no1, no2);
            if (result == 1) {
                System.out.println("Yes The Second Number Is Multiple Of First Number");
            } else {
                System.out.println("No The Second Number Is Not Multiple Of First Number");
            }
        }
        input.close();
    }
}
