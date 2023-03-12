import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number ...");
        int number=input.nextInt();
        input.close();
      int f=1,i=1;

        while (i<=number) {
           f=f*i;
           i++;
        }
        System.out.println("The Factorial is : "+f);
    }
}
