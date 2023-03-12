import java.util.Scanner;

public class NoOfCharacterInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your STring");
        String str = input.nextLine();
        System.out.println("The Number of Character in String are : " + str.length());
        input.close();
    }
}
