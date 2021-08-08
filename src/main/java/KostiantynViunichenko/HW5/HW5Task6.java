package KostiantynViunichenko.HW5;

import java.io.*;
public class HW5Task6 {

    public static int min(int a, int b, int c, int d, int e) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Введите 5 чисел: ");
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());
        d = Integer.parseInt(reader.readLine());
        e = Integer.parseInt(reader.readLine());
        int res = a;
        if (res > b)
            res = b;
        if (res > c)
            res = c;
        if (res > d)
            res = d;
        if (res > e)
            res = e;
        System.out.print(" Минимально введённое число = ");
        return res;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(min(0, 0, 0, 0, 0));
    }
}



