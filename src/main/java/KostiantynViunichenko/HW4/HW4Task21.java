package KostiantynViunichenko.HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HW4Task21 {
    public static void main(String[] args) throws IOException {
        String letter = "8";
        for (int m = 0; m < 2; m++) {
            for (int n = 0; n < 3; n++) {
                System.out.print(letter);
            }
            System.out.println(letter);
        }
    }
}