public class AllPossibleCombinationOfThreeDigits {
    public static void main(String[] args) {
        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <=3; j++) {
                for (int j2 = 1; j2 <=3; j2++) {
                    System.out.print(i+""+j+""+j2+"\t");
                }
            }
        }
    }
}
