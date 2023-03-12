import java.util.Scanner;

public class CheckVowelChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Alphabet to check Whether it is vowel or not...!");
        char ch = input.next().charAt(0);
        input.close();
        if ( ch=='A' || ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u') {
           System.out.println("Yes the Character is Vowel");

        } else{
            System.out.println("NO the Character is not Vowel");

        }
    }
}
