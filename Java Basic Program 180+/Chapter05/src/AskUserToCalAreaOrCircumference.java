import java.util.Scanner;

public class AskUserToCalAreaOrCircumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle");
        int radius = input.nextInt();
        System.out.println("Enter 1 for Area And 2 for Circumference");
        int choice = input.nextInt();
        input.close();
        if (choice == 1) {
            Double area = 3.141 * radius * radius;
            System.out.println("The Area of Circle is : " + area);
        } else if (choice == 2) {
            Double circumference = 2 * 3.141 * radius;
            System.out.println("The Circumference of Circle is : " + circumference);
        } else {
            System.out.println("Inavlid choice...!");
        }

    }
}
