import java.util.Scanner;

public class ConcatenateTwoString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Your First Name ... ");
        String first=input.next();//next line to read the first middle and last name
        System.out.println("Please Enter Your Last Name ... ");
        String last=input.next();//next line to read the first middle and last name
        String Name=first+" "+last;
        System.out.println("Hello Mr."+Name);
        input.close();
    }
}
