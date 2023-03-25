package J;
public class PrivateClass {
    private class B {
        B() {
            System.out.println("B");
        }

    }

    public static void main(String[] args) {
        PrivateClass object = new PrivateClass();
        B obj = object.new B();
        System.out.println(obj);
    }
}
