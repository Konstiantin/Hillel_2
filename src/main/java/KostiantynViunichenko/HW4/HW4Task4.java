package KostiantynViunichenko.HW4;

import java.io.IOException;
public class HW4Task4 {
    public static void main(String[] args) throws IOException {

        for (int i = 0; i <= 5; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
