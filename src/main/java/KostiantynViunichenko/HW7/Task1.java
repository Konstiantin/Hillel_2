package KostiantynViunichenko.HW7;

//    Создать строку, используя форматирование: Студент [Фамилия]
//    получил [оценка] по [предмету]. Форматирование и вывод строки на
//    консоль написать в отдельном методе, который принимает
//    фамилию, оценку и название предмета в качестве параметров.
//            Пример:
//    Студент Иванов получил 5 по биологии

public class Task1 {

    public static void main(String[] args) {
        printStudentInfo("Петров", "5", "математике");
    }

    public static void printStudentInfo(String lastName, String rating, String subject) {
        System.out.printf("Студент %s получил %s по %s\n", lastName, rating, subject);
    }
}
