import java.util.Scanner;

public class DisplayEvenNoInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Starting Number ...");
        int n1 = input.nextInt();
        System.out.println("Enter Ending Number ...");
        int n2 = input.nextInt();
        input.close();

        int i = n1;
        while (i<=n2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}
