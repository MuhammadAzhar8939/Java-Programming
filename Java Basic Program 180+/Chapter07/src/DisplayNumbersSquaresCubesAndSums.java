public class DisplayNumbersSquaresCubesAndSums {
  public static void main(String[] args) {
    int[] numbers = new int[5];
    int[] square = new int[5];
    int[] cubes = new int[5];
    int[] sums = new int[5];
    int GrandTotal=0;
    System.out.print("Numbers \t");
    for (int i = 0; i < numbers.length; i++) {
        numbers[i]=i;
        System.out.print(numbers[i]+"\t");        
    }
    System.out.println("");

    System.out.print("Squares \t");
    for (int i = 0; i < square.length; i++) {
        square[i]=i*i;
        System.out.print(square[i]+"\t");        
    }
    System.out.println("");

    System.out.print("Cubes \t\t");
    for (int i = 0; i < cubes.length; i++) {
        cubes[i]=i*i*i;
        System.out.print(cubes[i]+"\t");        
    }
    System.out.println("");

    System.out.print("Sums \t\t");
    for (int i = 0; i < cubes.length; i++) {
        sums[i]=(numbers[i]+square[i]+cubes[i]);
        GrandTotal=GrandTotal+sums[i];
        System.out.print(sums[i]+"\t");        
    }
    System.out.println("\nGrand Total is : "+GrandTotal );
  }

}
