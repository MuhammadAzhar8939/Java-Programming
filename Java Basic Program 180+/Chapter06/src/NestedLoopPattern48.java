public class NestedLoopPattern48 {
    public static void main(String[] args) {
        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
        for (int i = 2; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }

    }
}
