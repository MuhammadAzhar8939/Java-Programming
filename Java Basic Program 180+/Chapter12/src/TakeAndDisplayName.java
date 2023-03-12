import java.util.Scanner;

public class TakeAndDisplayName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Tell me Your Name ... ");
        String name=input.next();//it will only display first word
        System.out.println("Hello Mr."+name);
        input.close();
    }
}
