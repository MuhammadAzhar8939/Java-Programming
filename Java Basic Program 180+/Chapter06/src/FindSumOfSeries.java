public class FindSumOfSeries {
    public static void main(String[] args) {
        float c=2,r=1;
        while (c<=100) {
            r=r+1/c;
            c=c+2;
        }
        System.out.println("The sum is : "+r);
    }
}
/*1+1/2+1/4+1/6+...+1/100 */