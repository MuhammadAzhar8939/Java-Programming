import java.util.Scanner;

class CheckArmstrongNumber{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number To check Armstrong");

        int num=input.nextInt();
        input.close();
        int sum=0,r,n;
        n=num;
        while (num!=0) {
            r=num%10;
            sum=sum+(r*r*r);
            num=num/10;
        }
        if (sum==n) {
            System.out.println(n+" is Armstrong Number and Sum of Number is also : "+sum);            
        }else{
            System.out.println("NO It is Not ArmStrong ");
        }
    }

}