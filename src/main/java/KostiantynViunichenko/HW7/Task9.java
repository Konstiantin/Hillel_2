package KostiantynViunichenko.HW7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Дана строка “Versions: Java 5, Java 6, Java 7, Java 8, Java 12.”
//        Найти все подстроки "Java X" и распечатать их. Использовать
//        регулярные выражени

public class Task9 {
    public static void main(String[] args) {

        String regex = "\\bJava \\d+";
        String s = "Versions: Java 5, Java 6, Java 7, Java 8, Java 12";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println("Versions: " + matcher.group());
        }
    }
}
