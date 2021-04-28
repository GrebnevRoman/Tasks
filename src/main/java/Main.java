import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HelloAlgorithm helloAlgorithm = new HelloAlgorithm();
        VyacheslavHello vyacheslavHello = new VyacheslavHello();
        Scanner in = new Scanner(System.in);
        Scanner secondIn = new Scanner(System.in);
        Scanner thirdIn = new Scanner(System.in);

        System.out.print("Задание 1: " + "Введите число ");
        int value = in.nextInt();
        helloAlgorithm.helloReturn(value);

        System.out.print("Задание 2: " + "Введите имя ");
        String name = secondIn.nextLine();
        System.out.print(vyacheslavHello.VyacheslavOrNotFinder(name));

        System.out.print("Задание 3: " + "Введите размер массива ");
        int size = thirdIn.nextInt();
        MultiplicityCalculator multiplicityCalculator = new MultiplicityCalculator(size);

        multiplicityCalculator.fillArray();
        multiplicityCalculator.calculateMultiplicity();
    }
}
