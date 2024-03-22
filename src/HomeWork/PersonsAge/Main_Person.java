package HomeWork.PersonsAge;
//      Задача на дом «Person»
//
// Выполнить практику 4 с урока
// В класс Person добавить поле age
// Реализовать геттер и сеттер для поля age
// Сделать метод для получения года рождения человека
// В классе Lesson_4.Main создать объект класса Person, установить ему значение поля age и вывести на экран год рождения человека
public class Main_Person {

    public static void main(String[] args) {

        String name = "Ivan",
               middleName = "Ivanovich",
               familyName = "Ivanov",
               nameNew  = "Petr";

        int age = 33,
            ageNew = 25,
            ageWrong = 14;

        Person pers1 = new Person(name, middleName, familyName, age);

        System.out.println(pers1);
        System.out.println("Год рождения: " + pers1.getBirthYear() + "\n");

        pers1.setAge(ageWrong);
        System.out.println("Возраст не изменился: " + pers1.getAge() + "\n");
        System.out.println("Минимальный возраст: " + Person.getMinAge());

        pers1.setAge(ageNew);
        System.out.println(pers1);
        System.out.println("Год рождения: " + pers1.getBirthYear() + "\n");

        pers1.setName(nameNew);
        pers1.printName();

    }
}
