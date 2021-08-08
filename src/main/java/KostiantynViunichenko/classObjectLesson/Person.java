package KostiantynViunichenko.classObjectLesson;

//1. Создать класс Person.
//        В классе должно быть 3 поля:
//        - String имя;
//        - int возраст;
//        - boolean женат/замужем;
//        2. Создать конструктор, используя слово this:
//        - по умолчанию (по умолчанию имя = Ivan, возраст = 30,
//        женат/замужем = false )
//        - с 1 параметром
//        - с 2мя параметрами
//        - с 3мя параметрами
//        3. Переделать toString() для класса Person используя
//        форматирование(StringFormat).
//        Пример: “My name is [имя]. I’m [возраст] years old. Am I married?
//        [женат/замужем]”
//        4. Переопределить метод hashcode() и equals().
//        5. Создать несколько объектов класса Person:
//        - используя конструктор по умолчанию.
//        - используя конструктор с 1 параметром
//        - используя конструктор с 2 параметрами
//        - используя конструктор с 3 параметрами
//        6. Изменить значение поля “возраст” для созданного ранее объекта.
//        7. Вывести значение:
//        - поля возраст для всех объектов
//        - поля имя для всех объектов
//        - поля женат/замужем для всех объектов
//        8. Создать массив, записать в него все ранее созданные объекты.
//        Вывести массив в консоль
//        9. Создать методы. Методы должны находится внутри класса
//        Person. Методы должны что-то возвращать:
//        - сколько юбилеев у меня уже было?(Юбилей - праздник 1 раз
//        в 10 лет)
//        - с какой буквы начинается мое имя?
//        10. Создать геттеры и сеттеры для всех полей

import java.util.Objects;

public class Person {

    private static Object Person;
    String name;
    int age;
    boolean married;

    public Person() {
        this.name = "Ivan";
        this.age = 30;
        this.married = false;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public void setName (String name) { this.name = name; }

    public void setAge (int age) { this.age = age; }

    public boolean setMarried(boolean married) { return married; }

    public String getName() {return name; }

    public int getAge() {
        return age;
    }

    public boolean getMarried() {
        return married;
    }

    @Override
    public String toString() {
        return String.format("My name is %s. I’m %d years old. Am I married? %b", name, age, married);
    }

    public int anniversaryCount () {
        return getAge() / 10;

    }

    public char firstCharOfName() {
        return name.charAt(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && married == person.married &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, married);
    }

    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Bill");
        Person person2 = new Person("Tom", 25);
        Person person3 = new Person("Jhon", 45, true);

        person2.age = 88;

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        Person[] mas = {person, person1, person2, person3};
        for (Person item : mas) {
            int age = item.getAge();
            System.out.println(item.getName() + " " + age + " " + item.getMarried());
        }
        System.out.printf("Сколько юбилеев у меня уже было?\nЮбилей у Вас был %d раз!\n", person3.anniversaryCount());

        System.out.printf("C какой буквы начинается мое имя?\nВаше имя начинается с буквы '%c'", person3.firstCharOfName());
    }
}





