import java.util.Scanner;

public class FindPowerUsingRecursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Base Number ");
        int base=input.nextInt();
        System.out.println("Enter Power Number");
        int power=input.nextInt();
        input.close();
        int p=Power(base,power);
        System.out.println("The Power is : "+p);
    }
    public static int Power(int b,int p){
        if (p<=0) {
            return 1;
        }else if(p==1){
            return b;
        }else{
            return b*Power(b,p-1);
        }
    }
}
