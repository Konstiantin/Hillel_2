package KostiantynViunichenko.test;

import java.util.*;

public class test {

    // создать Map<Integer, String> countries, добавить несколько значений с ключами не по порядку и вывести на экран
        public static void main(String[] args) {
            Map<Integer, String> countries = new HashMap<Integer, String>();

            countries.put(2,"Australia");
            countries.put(3,"Zhelandia");
            countries.put(4,"USA");
            countries.put(5,"Austria");
            countries.replace(5,"Germany");
            countries.remove(5);



            Collection<String> values = countries.values();
            for (String item:values){
                System.out.println(item);
            }
            //System.out.println(countries.get(5));
//            Set<Integer> keys = countries.keySet();
//            for (Integer key:keys){
//                System.out.println(key);
           // }
            // получим весь набор значений, обратите внимание что это
            // метод возвращает коллекцию
            // выведем все значения на экран

        }
}



