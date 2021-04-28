import java.util.Scanner;

public class MultiplicityCalculator {

    private final int size;
    private int[] array;

    public MultiplicityCalculator(int size) {
        this.size = size;

    }


    public void fillArray() {
        array = new int[size];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значения массива ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
    }


    public void calculateMultiplicity() {
        for (int j : array) {
            if (j % 3 == 0) {
                System.out.print(" Число " + j + " кратно  3 " + "\n" );
            }
        }
    }

}
