import java.util.Scanner;

public class FindPowerOfNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Base Number ...");
        int base=input.nextInt();
        System.out.println("Enter Power Number ...");
        int Power=input.nextInt();
        input.close();
        int i=1,result=1;
        do {
            result=result*base;
            i++;
        } while (i<=Power);
        System.out.println("The Result is : "+result);
    }
}
