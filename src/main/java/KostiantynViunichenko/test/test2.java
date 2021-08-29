package KostiantynViunichenko.test;

import jdk.dynalink.beans.StaticClass;

import java.util.HashMap;
import java.util.Map;

public class test2 {

    static class User{
        public String getName() {
            return name;
        }
        public User(String value) {
            name = value;
        }

        private String name;
    }

    public static void main(String[] args) {

        Map<String,User> people = new HashMap<String, User>();
        people.put("12a", new User ("Ivan"));
        people.put("13a", new User ("Maria"));
        people.put("14a", new User ("Mike"));

       for (Map.Entry<String, User>item:people.entrySet()){
            System.out.println("Key "+item.getKey() + " Value " + item.getValue().getName());
        }
     }
}

