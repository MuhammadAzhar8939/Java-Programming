import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Your age");
        int age=input.nextInt();
        System.out.println("Enter Your Name");
        String name=input.next();
        System.out.println("Enter Your City");
        String city=input.next();

  
        System.out.println("Hello Mr."+name+" You having been Living in "+city+" for "+age+" Years");

        input.close();

    }
}
