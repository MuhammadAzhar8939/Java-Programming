package practice;

public class Main {

    public class A {
        A() {
            System.out.println("A");
        }
    }

    private class B {
        int b = 10;
        B() {
            System.out.println("B");
        }
    }

    protected class C {
        protected int x = 10;
        C() {
            System.out.println("C");
        }
    }

    class D {
        D() {
            System.out.println("D");
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        A obj1 = obj.new A();
        B obj2 = obj.new B();
        C obj3 = obj.new C();
        D obj4 = obj.new D();
        E obj5 = new E();
        System.out.println("Calling Z Class to test Protected");
        Z obj6 = new Z();
        System.out.println("Calling X Class to test Public");
        X obj7 = new X();

    }

}

class E {
    E() {
        System.out.println("Trying to Use Private class");
        practice.Main ob = new practice.Main();
        // practice.Main.B obj=ob.new B();//Private cannot be accessed outside the class
    }
}

class Z {
    Z() {
        System.out.println("Trying to Use Public class");
        practice.Main ob = new practice.Main();
        practice.Main.C obj = ob.new C();
    }
}
class X {
    X() {
        System.out.println("Trying to Use Protected class");
        practice.Main ob = new practice.Main();
        practice.Main.A obj = ob.new A();
    }
}
