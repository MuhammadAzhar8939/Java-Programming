public class DisplayPatternUsingForLoop {
    public static void main(String[] args) {
        int i,j,sum=0;
        for (i = 1; i <= 5;i++) {
            System.out.print(1);
            sum=1;
            for (j = 2; j <=i; j++) {
                System.out.print("+"+j);
                sum=sum+j;

            }
            System.out.print("="+sum+"\n");

        }
    }
}
