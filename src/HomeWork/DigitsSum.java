package HomeWork;
//      Задача на дом «Цифры числа»
//
// Прочитать с консоли целое число
// Найдите сумму его цифр
// Найдите сумму только тех цифр числа, которые являются нечетными числами
// Найдите максимальную цифру числа
import java.util.Scanner;

public class DigitsSum {

    public static void main(String args[]) {

        int num,
            dig,
            sum = 0,
            sumUnev = 0,
            max = 0;

        String exp = "",
               expUnev = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nРазделение числа на цифры");
        do {
            System.out.print("Введите целое число (больше 10): ");
            num = scanner.nextInt();
        } while (num < 10);

        while (num > 0) {

            dig = num % 10;
            num = num / 10;

            if (dig > max) {
                max = dig;
            }

            sum += dig;
            exp = " + " + dig + exp;

            if (!isEven(dig)) {
                sumUnev += dig;
                expUnev = " + " + dig + expUnev;
            }
        }

        exp = exp.replaceFirst(" \\+ ", ""); // убирает лишний плюс из строки
        expUnev = expUnev.replaceFirst(" \\+ ", "");

        System.out.println( "\nВсе цифры:");
        System.out.println( exp + " = " + sum);
        System.out.println( "Наибольшая цифра: " + max);
        System.out.println( "\nНечетные цифры:");
        System.out.println( expUnev + " = " + sumUnev);
    }

    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }
}