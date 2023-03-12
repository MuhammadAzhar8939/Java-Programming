import java.util.Scanner;

/*
 * take even and odd number and then
 * multiply even with 5 and odd with 3
 * and add boths result
 * and then subtract from 1000 and print result
 */
public class ManipulationUsingEvenAndOddNo {
    public static void main(String[] args) {
        int even,odd,result;
        Scanner inpScanner=new Scanner(System.in);
        System.out.println("Enter an Even Number");
        even=inpScanner.nextInt();
        System.out.println("Enter an ODD Number");
        odd=inpScanner.nextInt();
        inpScanner.close();
        result=1000-((even*5)+(odd*3));
        System.out.println("The Result is : "+result);

    }
}
