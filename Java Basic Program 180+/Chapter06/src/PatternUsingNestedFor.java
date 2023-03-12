public class PatternUsingNestedFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= 1; j--) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
