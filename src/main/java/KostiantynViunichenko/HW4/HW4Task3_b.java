package KostiantynViunichenko.HW4;

public class HW4Task3_b {
    public static void main(String[] args) {
        String k1 = " Курица ", kr1 = " Корова! ";
        String k2 = " Курицы ", kr2 = " Коровы! ";
        int i, j;
        System.out.println("\n");
        for (i = 4; i > 0; i--) {
            if (i == 1) System.out.print("В доме есть " + i + k1);
            else System.out.print("В доме есть " + i + k2);
            for (j = 1; j < 5; j++) {
                if (i + j == 5)
                    if (j == 1) System.out.print(" и " + j + kr1);
                    else System.out.print(" и " + j + kr2);
                }
            System.out.println();
            }
        }
    }

