public class CompoundAssignmentOp {
    public static void main(String[] args) {
        int a =10;
        System.out.println("Value of a : "+ a);
        System.out.println("Value of a+=5 : "+ (a+=5));
        System.out.println("Value of a-=5 : "+ (a-=5));
        System.out.println("Value of a*=2 : "+ (a*=2));
        System.out.println("Value of a/=2 : "+ (a/=2));
        System.out.println("Value of a%=2 : "+ (a%=2));
    }
}
