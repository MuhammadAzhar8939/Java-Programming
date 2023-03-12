import java.util.Scanner;

public class AsciiToCharToAscii {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1: Convert Ascii To Character");
        System.out.println("2: Convert Character To Ascii");
        int choice=input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Number ...");
                int no=input.nextInt();
                char ch=((char)no);
                System.out.println("The Corresponding Character is : "+ch);
                break;
            case 2:
                System.out.println("Enter Character ...");
                char c=input.next().charAt(0);
                int n=((int)c);
                System.out.println("The Corresponding Ascii Number is is : "+n);
                break;
        
            default:
            System.out.println("Invalid Choice ...");
                break;
        }
        input.close();
    }
}
