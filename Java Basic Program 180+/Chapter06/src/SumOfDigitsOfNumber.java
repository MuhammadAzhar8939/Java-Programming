import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number ...");
        int number=input.nextInt();
        input.close();
      int sum=0,r;

        while ( number!=0) {
            r=number%10;
            if(r!=0){
                sum=sum+r;
            }
            number=number/10;
        }
        System.out.println("The Sum is : "+sum);
    }
}
