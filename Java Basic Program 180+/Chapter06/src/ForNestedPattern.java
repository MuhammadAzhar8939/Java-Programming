public class ForNestedPattern {
    public static void main(String[] args) {
        int c = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i+" ");
            }
            System.out.println("");
            c--;
        }
    }
}
