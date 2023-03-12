public class SumOfSeriesUsingForAndContinue {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                sum = sum + i;
            }
        }
        System.out.println("The Sum is : " + sum);
    }
}

/*
 * series is ==> 1,3,5,7...100
 */