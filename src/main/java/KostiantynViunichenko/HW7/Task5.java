package KostiantynViunichenko.HW7;
//        Дана строка:
//       “It's the possibility of having a dream come true that makes life interesting.”
//        Необходимо:
//        а) перевести в верхний регистр все буквы в строке. Вывести
//        результат в консоль
//        б) перевести в нижний регистр все буквы в строке. Вывести
//        результат в консоль
//        в) каждое слово должно начинаться с большой буквы. Вывести
//        результат в консоль.

public class Task5 {

    public static void main(String[] args) {

        String str = "It's the possibility of having a dream come true that makes life interesting.";
        System.out.println("\n" + "a) " + str.toLowerCase()+ "\n");
        System.out.println("b) "+ str.toUpperCase()+"\n");

        String str2 = " ";
        str2 = str2 + str.substring(0, 1).toUpperCase();

        for (int i = 1; i < str.length(); i++) {
            if (" ".equals(str.substring(i - 1, i)))
                str2 = str2 + str.substring(i, i + 1).toUpperCase();
            else
                str2 = str2 + str.substring(i, i + 1);
        }
        System.out.println("c) " + str2);
    }
}


