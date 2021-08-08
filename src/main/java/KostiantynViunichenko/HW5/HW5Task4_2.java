package KostiantynViunichenko.HW5;

import java.io.*;

public class HW5Task4_2 {

    public static String multiply2(String s){
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + s + " ");
        }
        return s;
    }
    public static void main(String[] args) throws IOException {
        multiply2(" Солнце!!!");
    }

}
