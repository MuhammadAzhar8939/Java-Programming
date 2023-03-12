public class PatternUsingWhileInsideFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            int j = 7;
            while (j > i) {
                System.out.print("* ");
                j--;
            }
            System.out.println("");
        }
    }

}
