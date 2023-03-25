package J;

import J.K.PublicClassInside;

public class PublicClass {
    public class A {
        public A() {
            System.out.println("A");
        }
    }

    public static void main(String[] args) {
        PublicClass object = new PublicClass();
        A obj = object.new A();
        System.out.println(obj);
    }
}
