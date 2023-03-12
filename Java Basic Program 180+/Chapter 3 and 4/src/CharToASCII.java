import java.util.Scanner;

public class CharToASCII {
    public static void main(String[] args) {
        Scanner character = new Scanner(System.in);
        System.out.println("Enter Character you wanna know ascii value");
        int ascii = character.next().charAt(0);
        character.close();
        System.out.println("The ASCII value is : "+ascii);

    }
}
