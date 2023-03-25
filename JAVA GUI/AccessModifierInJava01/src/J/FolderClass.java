package J;

public class FolderClass {
class D {
        D() {
            System.out.println("C");
        }

}

    public static void main(String[] args) {
        FolderClass object = new FolderClass();
        D obj = object.new D();
        System.out.println(obj);
    }
}
