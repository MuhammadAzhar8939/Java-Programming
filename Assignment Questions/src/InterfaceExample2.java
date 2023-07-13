interface addition{
    void add();
}
interface subtraction extends addition{
    void sub();
}

public class InterfaceExample2 implements subtraction{
    private int a=10,b=5;
    @Override
    public void add() {
        System.out.println("addition of two number is : "+(a+b));
    }
    
    @Override
    public void sub() {
        System.out.println("subtraction of two number is : "+(a-b));
    }
    
    public static void main(String[] args) {
        InterfaceExample2 example=new InterfaceExample2();
        example.add();
        example.sub();
    }
}
