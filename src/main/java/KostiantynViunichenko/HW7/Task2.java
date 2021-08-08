package KostiantynViunichenko.HW7;

//Условие задачи: ввести 2 слова с клавиатуры, состоящие из
//        четного числа букв. Получить слово состоящее из первой половины
//        первого слова и второй половины второго слова. Вывести
//        полученное слово на экран
//        String a = “1122”;
//        String b = “3344”;
//        ”Result: 1144

import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String a, b;
        System.out.println("Введите первое слово: ");
        a = scanner.nextLine();
        System.out.println();
        System.out.println("Введите второе слово: ");
        b = scanner.nextLine();

         String s1 = a.substring(0,(a.length()/2));
         String s2 = b.substring((b.length()/2));
         String result = s1+s2;

        System.out.println("String a = "+ a);
        System.out.println("String b = "+ b);
        System.out.println("Result: "+result);
    }
}