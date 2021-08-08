package KostiantynViunichenko.HW3;

import java.io.InputStreamReader;
import java.io.*;

public class HW3TaskAdvanced {
    public static void main(String[] args) throws Exception {
        int a, b, c;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Введите сторону А: ");
        a = Integer.parseInt(reader.readLine());
        System.out.println(" Введите сторону B: ");
        b = Integer.parseInt(reader.readLine());
        System.out.println(" Введите сторону C: ");
        c = Integer.parseInt(reader.readLine());

        if (a + b <= c) {
            System.out.println("Треугольник не существует!");
        } else if (c + b <= a) {
            System.out.println("Треугольник не существует!");
        } else if (c + a <= b) {
            System.out.println("Треугольник не существует!");
        }
            else if ((a + b > c) | (c + b > a) | (a + c > b)) {
                System.out.println("Треугольник существует!");
            }
        }

    }

