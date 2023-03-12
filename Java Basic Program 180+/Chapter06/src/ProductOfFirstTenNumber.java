public class ProductOfFirstTenNumber {
    public static void main(String[] args) {
        int product=1;
        for (int i = 1; i <= 10; i+=2) {
            product=product*i;
        }
        System.out.println(product);
    }
}
// product of odd numbers from 1-10