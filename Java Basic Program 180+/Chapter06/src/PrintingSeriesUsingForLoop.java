public class PrintingSeriesUsingForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 40; i += 3) {
            if (i % 2 == 0) {
                System.out.print(-i + "\t");
            } else {
                System.out.print(i + "\t");
            }
        }
    }
}
/*
 * 1,-4,7,-10,13,...40;
 * 
 */