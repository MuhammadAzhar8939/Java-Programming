import java.util.Scanner;

public class DisplayPatternUsingNestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Character ...");
        char choice = input.next().charAt(0);
        input.close();
        int count = 1;
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 5 * 2 - 1; j++) {
                if (j == i || j == ((5 * 2 - 1) - count)) {
                    System.out.print(choice);
                } else {
                    System.out.print(" ");
                }
            }
            count++;
            System.out.println("");

        }
    }
}
