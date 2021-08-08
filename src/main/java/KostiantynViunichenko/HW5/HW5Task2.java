package KostiantynViunichenko.HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HW5Task2 {


    public static void main(String[] args) throws IOException {
        float s;
        System.out.println(" Введите X для вычисления уравнения:\n" + " s = корень из х ; ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float x = Integer.parseInt(reader.readLine());
        s = (float) Math.sqrt(x);
        System.out.println(" Корень из " + x + " = " + s);
        System.out.println(" Уравнение s=(s в степени х) + 4; ");
        s = (float) (Math.pow(s, x) + 4);
        System.out.println(" Результат = " + s);
    }

}
