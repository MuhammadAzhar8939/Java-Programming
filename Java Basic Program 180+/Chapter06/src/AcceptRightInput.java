import java.util.Scanner;

public class AcceptRightInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char str;
        do {
            System.out.println("Enter 'W' if Telephone is working, otherwise enter 'd'");
            str=input.next().charAt(0);
        } while (str!='W'&&str!='w'&&str!='D'&&str!='d');
        input.close();
        if (str=='W'||str=='w') {
            System.out.println("Telephone is working");
        } else {
            System.out.println("Telephone is Dead");
            
        }
    }
}
