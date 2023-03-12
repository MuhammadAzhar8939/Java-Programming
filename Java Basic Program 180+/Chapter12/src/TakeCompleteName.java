import java.util.Scanner;

public class TakeCompleteName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Tell me Your Name ... ");
        String name=input.nextLine();//next line to read the first middle and last name
        System.out.println("Hello Mr."+name);
        input.close();
    }
}
