import java.util.Scanner;

public class CompareTwoString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First String");
        
        String str1=input.nextLine();
        System.out.println("Enter Second String");
        String str2=input.nextLine();

        System.out.println("Comparison of both string");
        if (str1.equals(str2)) {
            System.out.println("Both Strings Are Equal");
        } else if(str1.length()>str2.length()){
            System.out.println("First String is Greater then Second");

        }else if(str1.length()< str2.length() ){
            System.out.println("Second String is Greater then First");

        }

        input.close();
    }
}
