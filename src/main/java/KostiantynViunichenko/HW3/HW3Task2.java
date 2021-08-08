package KostiantynViunichenko.HW3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class HW3Task2 {
    public static void main(String[] args) throws Exception {
        int i;
        System.out.print(" Введите номер месяца: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        i = Integer.parseInt(reader.readLine());

        if (i <= 0 | i > 12) {
            System.out.println(" Такого месяца не существует!!!");
        }
         if (i==12 | i<3) {
                System.out.print(" Зима ");
            } else if (i == 3 | i < 6) {
                System.out.print(" Весна ");
            } else if (i == 6 | i<9) {
                System.out.print(" Лето! ");
            } else if (i == 9 | i <12 ) {
                System.out.print(" Осень! ");
         }
    }
}
