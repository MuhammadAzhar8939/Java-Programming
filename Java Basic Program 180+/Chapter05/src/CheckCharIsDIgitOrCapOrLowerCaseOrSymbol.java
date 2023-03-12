import java.util.Scanner;

public class CheckCharIsDIgitOrCapOrLowerCaseOrSymbol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any character...!");
        char ch = input.next().charAt(0);
        input.close();
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The Character is Capital letter");

        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The Character is small case letter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("The Character is Digit");
        } else {
            System.out.println("The Character is Symbol");
        }
    }
}
