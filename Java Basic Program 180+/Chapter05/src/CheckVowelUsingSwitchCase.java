import java.util.Scanner;

public class CheckVowelUsingSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Character");
        char ch = input.next().charAt(0);
        input.close();
        switch (ch) {
            case 'A':
            case 'a':
                System.out.println("You Entered Vowel");
                break;
            case 'E':
            case 'e':
                System.out.println("You Entered Vowel");
                break;
            case 'I':
            case 'i':
                System.out.println("You Entered Vowel");
                break;
            case 'O':
            case 'o':
                System.out.println("You Entered Vowel");
                break;
            case 'U':
            case 'u':
                System.out.println("You Entered Vowel");
                break;

            default:
                System.out.println("Not Vowel");
                break;
        }
    }
}
