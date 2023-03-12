public class PatternUsingNestedDoWhile {
    public static void main(String[] args) {
        int m=4,n;
        do {
            n=m;
            do {
                System.out.print(m+"\t");
                n--;
            } while (n>=1);
            System.out.println("");
            m--;
        } while (m>=1);
    }
}
