package Azhar;

import Azhar.k.E;

public class A {
    public A() {
        System.out.println("A");

    }

    public static void main(String[] args) {
        D obj=new D();
        A obj1=new A();
        B obj2=new B();
        C obj3=new C();
        E obj4=new E();//need to change constructor of E to Public
    }
}
