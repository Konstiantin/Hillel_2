package KostiantynViunichenko.HW3;

import java.io.*;

public class Color {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите цвет:");
        String color = bufferedReader.readLine();

        switch (color) {
            case "Красный":
                System.out.println("Мой любимый цвет- Красный! ");
                break;
            case "Оранжевый":
                System.out.println("Мой любимый цвет- Оранжевый! ");
                break;
            case "Жёлтый":
                System.out.println("Мой любимый цвет- Жёлтый! ");
                break;
            case "Зеленый":
                System.out.println("Мой любимый цвет- Зеленый! ");
                break;
            case "Голубой":
                System.out.println("Мой любимый цвет- Голубой! ");
                break;
            case "Синий":
                System.out.println("Мой любимый цвет- Синий! ");
                break;
            case "Фиолетовый":
                System.out.println("Мой любимый цвет- Фиолетовый! ");
                break;
            default:System.out.println("У меня нет любимого цвета! \n");
        }
    }
}

