package KostiantynViunichenko.HW5;

import java.io.*;

public class HW5task4_1 {
    public static String multiply(String s, int count)  {
        for (int i = 0; i < count; i++) {
            System.out.print(" " + s + " ");
        }
        return s;
    }

    public static void main(String[] args) throws IOException {
        multiply("Солнце!!!",8);
    }
}


