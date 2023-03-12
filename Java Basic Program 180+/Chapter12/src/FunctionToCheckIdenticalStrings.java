import java.util.Scanner;

public class FunctionToCheckIdenticalStrings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First String");
        String str1=input.nextLine();
        System.out.println("Enter Second String");
        String str2=input.nextLine();
        input.close();
        CheckString(str1, str2);
    }
    public static void CheckString(String s1,String s2){
        if (s1.contentEquals(s2)) {
            System.out.println("Yes Strings Are Identical");
        } else {
            System.out.println("No Strings Are Not Identical");

        }
    }
}
