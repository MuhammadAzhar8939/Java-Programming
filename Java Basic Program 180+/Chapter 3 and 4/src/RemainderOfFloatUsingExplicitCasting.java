//write a program that divides two double variables and finds remainder using explicit casting
public class RemainderOfFloatUsingExplicitCasting {
    public static void main(String[] args) {
        double a=10.3;
        double b=5.2;
        System.out.println("a = "+a+", b = "+b);
        int c =(int) (a) % (int) (b);
        System.out.println("The Remainder of  'a' and 'b' is : "+c+"\n");

    }
}
