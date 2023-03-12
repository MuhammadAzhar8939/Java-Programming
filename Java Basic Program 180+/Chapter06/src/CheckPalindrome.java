import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        int n,num,digit,rev=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number ...");
        num=input.nextInt();
        input.close();
        n=num;
        do {
           digit=num%10;
           rev=(rev*10)+digit;
           num=num/10; 
        } while (num!=0);
        System.out.println("The Reverse of the number is : "+rev);
        if (n==rev) {
            System.out.println("The Number is palindrome");
        } else {
            System.out.println("The Number is not palindrome");
            
        }
    }
}
