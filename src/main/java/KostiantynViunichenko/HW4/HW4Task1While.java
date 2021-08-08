package KostiantynViunichenko.HW4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HW4Task1While {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter digit:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int digit, sum=0;
        while (true){
            digit = Integer.parseInt(reader.readLine());
            sum += digit;
            if(digit == -1)
                break;
        }
        System.out.println("Sum of digit = " + (sum ) + "\n");;
    }
}