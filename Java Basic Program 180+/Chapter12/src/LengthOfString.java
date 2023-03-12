import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter String To Know its Length ... ");
        String str=input.nextLine();//next line to read the first middle and last name
        System.out.println("The Length of Your Name is : "+str.length());
        input.close();
    }
}
