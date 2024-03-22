package HomeWork.PersonsAge;

import java.time.LocalDateTime;

public class Person {

    private String name;
    private String middleName;
    private String familyName;
    private int age;
    public static final int MIN_AGE = 15;

    public Person(String name, String middleName, String familyName, int age) { // конструктор

        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public static int getMinAge() { // метод для получения статического поля
        return MIN_AGE;

    }
    public int getAge() {
        return age;
    }

    public int getBirthYear() {
        return LocalDateTime.now().getYear() - getAge();
    }

    public void setAge(int age) {
        System.out.println("Менаяем возраст на: " + age);
        if (age >= this.MIN_AGE) {
            this.age = age;
            System.out.println("Возраст был изменен на: " + this.age);
        } else {
            System.out.println("Ошибка! Значение " + age + " меньше минимального (" + this.MIN_AGE + ")");
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.length() == 0)) {
            this.name = name;
            System.out.println("Имя было изменено на: " + this.name);
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "{ ФИО: " + familyName + " " + name + " " + middleName + ", Возраст: " + age + " }";
    }

    public void printName() {
        System.out.println("Имя: " + name);
    }

}
