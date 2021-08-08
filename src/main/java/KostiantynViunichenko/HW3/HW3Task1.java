package KostiantynViunichenko.HW3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class HW3Task1 {
    public static void main(String[] args) throws Exception {
        int i;
        System.out.print("Give points[0-100]: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        i = Integer.parseInt(reader.readLine());
        System.out.print("Your Points: ");
        System.out.println(i);
        if (i < 0) {
            System.out.println(" Impossible! ");
            System.out.println(" Please enter correct your Points!");
        }
        else if ( i == 0 | i < 50) {
            System.out.print(" Gradle: Failed!  ");
        }
        else if ( i < 60 | i==50){
            System.out.print(" Gradle: 1 ");
        }
        else if ( i < 70 | i==60){
            System.out.print(" Gradle: 2 ");
        }
        else if ( i < 80 | i==70){
            System.out.print(" Gradle: 3 ");
        }
        else if ( i < 90 | i==80){
            System.out.print(" Gradle: 4 ");
        }
        else if ( i <= 100 | i==90){
            System.out.print(" Gradle: 5 ");
        }
        else if ( i > 100){
            System.out.print(" Gradle: Incredible! ");
        }
    }
}