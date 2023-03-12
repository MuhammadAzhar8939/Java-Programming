import java.util.Scanner;

public class EvenAndOddSumTillNo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number ...");
        int number=input.nextInt();
        input.close();
        int evenSum=0,oddSum=0;
        int i=1;
        while (i<=number) {
            if (i%2==0) {
                evenSum=evenSum+i;
            }
            else{
                oddSum=oddSum+i;
            }
            i++;
        }
        System.out.println("The Even Sum is : "+evenSum);
        System.out.println("The Odd Sum is : "+oddSum);
    }
}
