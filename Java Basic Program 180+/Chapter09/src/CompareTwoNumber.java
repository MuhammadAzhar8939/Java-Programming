import java.util.Scanner;

public class CompareTwoNumber {
    static void maxmin(int a,int b){
        if (a>b) {
            System.out.println("The Maximum Number is A = "+a);
        } else {
            System.out.println("The Maximum Number is B = "+b);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Number A ");
        int no1=input.nextInt();
        System.out.println("Enter Second Number B ");
        int no2=input.nextInt();
        maxmin(no1, no2);
        input.close();
    }
}
