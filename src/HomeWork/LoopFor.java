package HomeWork;
//      Задача на дом «Цикл for»
//
// Распечатать числа, кратные четверке от 1 до 100, причем в обратном порядке (то есть, начиная с 100)
// Определение кратности четверке вынести в отдельную функцию
// Использовать цикл for
public class LoopFor {

    public static void main(String[] args) {

        for (int i = 100; i > 0; i--) {

            if (isMultiple(i,  4)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isMultiple(int num, int div) {
        return (num % div == 0);
    }
}