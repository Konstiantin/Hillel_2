package KostiantynViunichenko.HW3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class HW3Task3 {

    public static void main(String[] args) throws Exception {
        int i;
        System.out.print(" Введите число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        i = Integer.parseInt(reader.readLine());
        System.out.println(" Введёное число: " + i );
        if (i < 0) {
            System.out.println("Число после преобразования: " + (i + 1));
        } else if (i == 0) {
            System.out.println (0);
        } else if (i > 0) {
            System.out.println ("Число после преобразования: \n" + (i * 2));
        }
        System.out.println(" DONE " );
    }
}