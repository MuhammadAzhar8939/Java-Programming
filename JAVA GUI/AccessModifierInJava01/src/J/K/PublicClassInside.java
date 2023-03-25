package J.K;

public class PublicClassInside {
    public class E {
        E() {
            System.out.println("E");
        }

    }

    public static void main(String[] args) {
        PublicClassInside object = new PublicClassInside();
        E obj = object.new E();
        //class A
        J.PublicClass obj1 =new J.PublicClass();
        J.PublicClass.A Obj2=obj1.new A();//still we have to make constructor public inside A
        //class B
        J.PrivateClass obj3 =new J.PrivateClass();
        // J.PrivateClass.B Obj4=obj1.new B();//private class is not visible here
        //class C
        J.ProtectedClass obj5 =new J.ProtectedClass();
        // J.ProtectedClass.C Obj6=obj1.new C();//protected also not visible inside other packages
        //class D
        J.FolderClass obj7 =new J.FolderClass();
        // J.FolderClass.D Obj8=obj1.new D();//error because D class is private class to FolderClass

    }
}
