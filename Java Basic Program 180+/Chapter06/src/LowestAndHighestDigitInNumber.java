import java.util.Scanner;

public class LowestAndHighestDigitInNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number ...");
        int num=input.nextInt();
        input.close();

        int high=num%10,low=num%10;
        num=num/10;
        for (int i = num; i >=1; i=i/10) {
            int r=i%10;
            if (r>high) {
                high=r;
            }
            if(r<low){
                low=r;
            }
        }
        System.out.println("Highest Digit is : "+high);
        System.out.println("Lowest Digit is : "+low);
    }
}
