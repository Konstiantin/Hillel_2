package KostiantynViunichenko.HW5;

import java.io.IOException;

public class HW5Task3 {
    public static float addTenPercent(float x) throws IOException {
        System.out.println(" Вы ввели число: "+x);
        float y = (float) (x * 1.1);
        System.out.print(" Ваше число + 10 % = " + y);
        return y;
    }
    public static void main(String[] args) throws IOException {
              addTenPercent(40);
    }
}

