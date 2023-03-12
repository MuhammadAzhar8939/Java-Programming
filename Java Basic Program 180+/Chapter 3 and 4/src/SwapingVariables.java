import java.util.Scanner;

public class SwapingVariables {
    public static void main(String[] args) {
        int n1,n2,temp;
        Scanner inpScanner=new Scanner(System.in);
        System.out.println("Enter Your First Number");
        n1=inpScanner.nextInt();
        System.out.println("Enter Your Second Number");
        n2=inpScanner.nextInt();
        System.out.println("Numbers Before swapping : "+n1+"\t"+n2);
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("Numbers After  swapping : "+n1+"\t"+n2);
        inpScanner.close();
    }
}
