import java.util.Scanner;

public class ProductComponentOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number ...");
        int num = input.nextInt();
        input.close();

        int s=1;
        for (int i=num;i>=s;i--) {
            for (int j = 1; j < num; j++) {
                if (i*j==num) {
                    System.out.println(i+" x "+j);
                    s=j+1;
                }
            }
            
        }
    }
}
