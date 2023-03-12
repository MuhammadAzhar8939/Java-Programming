public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=7-i; k++) {
                System.out.print(k);

            }
            System.out.println("");
        }
    }
}
