public class FunctionWithStaticVariable {

    static int num = 0;
    public static void func() {
        num++;
        System.out.println("The Value Of static Variable is : "+ num);
    }

    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            func();
        }
    }
}
