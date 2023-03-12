import java.util.Scanner;

public class SwapNumbersWithoutThirdVar {
    public static void main(String[] args) {
    int n1,n2;
    Scanner inpScanner=new Scanner(System.in);
    System.out.println("Enter Your First Number");
    n1=inpScanner.nextInt();
    System.out.println("Enter Your Second Number");
    n2=inpScanner.nextInt();
    System.out.println("Numbers Before swapping : "+n1+"\t"+n2);

    n1=n1+n2;
    n2=n1-n2;
    n1=n1-n2;
    System.out.println("Numbers After  swapping : "+n1+"\t"+n2);
    inpScanner.close();
}
}

/*
 * Example
 * n1=1
 * n2=2
 * n1=n1+n2-----n1=1+2----n1=3
 * n2=n1-n2-----n2=3-2----n2=1
 * n1=n1-n2-----n1=3-1----n1=2
 */