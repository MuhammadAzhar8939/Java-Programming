import java.util.Scanner;

public class TriangleOfCharacter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the height for triangle ...");
        int length=input.nextInt();
        input.close();
        char ch='A';
        for (int i = 1; i <=length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
    }
}
