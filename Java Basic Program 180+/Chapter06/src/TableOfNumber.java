import java.util.Scanner;

public class TableOfNumber {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number ...");
        int number=input.nextInt();
        input.close();
        int i=1;
        while ( i<=10) {
            System.out.println(number+" * "+ i +" = "+(number*i));
            i++;
        }
    }
}
