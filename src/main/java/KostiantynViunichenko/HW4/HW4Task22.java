package KostiantynViunichenko.HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW4Task22 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String letter = "8";
        int i,j;
        System.out.println("Enter your firs digit:");
        i = Integer.parseInt(reader.readLine());
        System.out.println("Enter your second digit:");
        j = Integer.parseInt(reader.readLine());
        for (int m = 0; m < j ; m++) {
            for ( int n = 1; n < i; n++) {
                System.out.print(letter);
            }
            System.out.println(letter);
        }
    }
}
