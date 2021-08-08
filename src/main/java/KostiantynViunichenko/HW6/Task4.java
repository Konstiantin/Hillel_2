package KostiantynViunichenko.HW6;
/*
Создать массив целых чисел. Отсортировать массив по
        убыванию(не использовать метод Arrays.sort()).
        Вывести массив до сортировки и после сортировки.
        Массив после сортировки вывести тремя способами:
        а) с помощью цикла for
        b) с помощью цикла foreach
        c) с помощью метода из класса Arrays
*/

import java.util.Arrays;
import java.util.Collections;

public class Task4 {

    public static void main(String[] args) {

        int array[] = {1, 8, 54, 71, 10, -5, -2};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int a = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = a;
                }
            }
        }
        System.out.print(" с помощью цикла for ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print(" с помощью цикла foreach ");
        for (int e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.print(" с помощью метода из класса Arrays "+  Arrays.toString(array));
    }
}