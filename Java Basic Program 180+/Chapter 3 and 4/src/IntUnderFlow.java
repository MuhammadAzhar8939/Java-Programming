public class IntUnderFlow {
    public static void main(String[] args) {
        short n1=-32768;//lowest possible value that short int can store
        System.out.println(n1);//printing value
        System.out.println(--n1);//trying to decrement which will cause interger under flow
    }
}
