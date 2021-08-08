package KostiantynViunichenko.HW7;

//Ввести 10 строк с консоли. Вывести на консоль те строки, длина
//        которых меньше средней.

import java.io.IOException;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) throws IOException {
        int n=0;
        int sc1 = 10;

        String[] str = new String[10];
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Введите 10 строк");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc2.nextLine();
        }
        float average = 0f;
        for (String i : str) {
            average += (float) i.length();
        }
        average /= str.length;

        System.out.println("Средняя длина строки:  (" + average + ")");
        System.out.println("Строка меньшая чем средняя длина: ");
        n = sc1;
        for (int i = 0; i < n; i++) {
            if (str[i].length() < average) {
                System.out.println(str[i] + " длина строки = " + str[i].length());
            }
        }
    }
}



