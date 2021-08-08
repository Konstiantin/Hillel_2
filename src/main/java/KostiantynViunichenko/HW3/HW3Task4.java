package KostiantynViunichenko.HW3;
import java.io.*;
public class HW3Task4 {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите цвет:");
        String color = bufferedReader.readLine();
        {
            if (color.equals("Красный")) {
                System.out.println("Мой любимый цвет- " + color);
            } else if (color.equals("Оранжевый")) {
                System.out.println("Мой любимый цвет- " + color);
            } else if (color.equals("Жёлтый")) {
                System.out.println("Мой любимый цвет- " + color);
            } else if (color.equals("Зеленый")) {
                System.out.println("Мой любимый цвет- " + color);
            } else if (color.equals("Голубой")) {
                System.out.println("Мой любимый цвет- " + color);
            } else if (color.equals("Синий")) {
                System.out.println("Мой любимый цвет- " + color);
            } else if (color.equals("Фиолетовый")) {
                System.out.println("Мой любимый цвет- " + color);
            } else System.out.println("У меня нет любимого цвета! \n");
        }
    }
}