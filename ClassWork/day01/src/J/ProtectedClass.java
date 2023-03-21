package J;
public class ProtectedClass {
    protected class C {
        C() {
            System.out.println("C");
        }

    }

    public static void main(String[] args) {
        ProtectedClass object = new ProtectedClass();
        C obj = object.new C();
        System.out.println(obj);
    }
}
