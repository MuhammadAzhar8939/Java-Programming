import java.util.Scanner;

public class CharacterInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter any character ... ");
        char name=input.next().charAt(0);//next line to read the first middle and last name
        System.out.println("You Have Enter \t"+name);
        input.close(); 
    }
}
