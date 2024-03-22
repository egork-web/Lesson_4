package HomeWork;
//      Задача на дом «Среднее арифметическое»
//
// Написать программу, вычисляющую среднее арифметическое чисел из некоторого диапазона чисел (например, от 3 до 17)
// Концы диапазона задать переменными, начальное число берите > 1, чтобы было посложнее
// Среднее арифметическое чисел – нужно сумму всех чисел поделить на количество этих чисел
// В этом же классе - найти среднее арифметическое только четных чисел из этого диапазона чисел
import java.util.Scanner;

public class AverageValue {

    public static void main(String[] args) {

        int fromNum,
            toNum,
            sum = 0,
            sumEv = 0,
            count = 0,
            countEv = 0;

        String nums = "",
               numsEv = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nЗадайте диапазон чисел");

        do {
            System.out.print("Введите первое число (больше 1): ");
            fromNum = scanner.nextInt();
        } while (fromNum <= 1);

        do {
            System.out.print("Введите последнее число (больше первого и меньше 100): ");
            toNum = scanner.nextInt();
        } while (toNum <= fromNum || toNum > 99);

        for (int i = fromNum; i <= toNum; i++) {

            count++;
            sum += i;
            nums += " " + i;

            if (isEven(i)) {

                countEv++;
                sumEv += i;
                numsEv += " " + i;
            }
        }
        System.out.println("Все числа в заданном диапазоне: " + nums);
        System.out.println("Среднее арифметическое: " + sum / count);

        System.out.println("Четные числа в заданном диапазоне: " + numsEv);
        System.out.println("Среднее арифметическое четных чисел: " + sumEv / countEv);
    }
    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }

}
