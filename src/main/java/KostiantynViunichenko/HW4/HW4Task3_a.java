package KostiantynViunichenko.HW4;

public class HW4Task3_a {

    public static void main(String[] args) {
        int i = 5;
        while (i>0) {
            for (int j=1; j<5; j++)
                if (i+j==5)
                    System.out.println("В доме есть " +i+ "" + " Курица"+" и " + j + " корова!");
            i--;
        }
    }
}
