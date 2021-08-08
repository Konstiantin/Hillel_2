package KostiantynViunichenko.HW7;

//        7) а) Дано два числа, например 3 и 56, необходимо составить
//        следующие строки:
//        3 + 56 = 59
//        3 – 56 = -53
//        3 * 56 = 168.
//        Используем метод StringBuilder.append().
//        б) Замените символ “=” на слово “равно”. Используйте методы
//        StringBuilder.replace().

public class Task7 {
    public static void main(String[] args) {

        int c = 3;
        int b = 56;

        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        s1.append(c + " + ");
        s2.append(b + " = " + (c + b));
        System.out.print(s1);
        System.out.print(s2+"\n");
        s2.replace(3,5,"равно ");
        System.out.print(s1);
        System.out.print(s2+"\n"+"\n");


        StringBuffer s3 = new StringBuffer();
        StringBuffer s4 = new StringBuffer();
        s3.append(c + " - ");
        s4.append(b + " = " + (c - b));
        System.out.print(s3);
        System.out.print(s4+"\n");
        s4.replace(3,5,"равно ");
        System.out.print(s3);
        System.out.print(s4+"\n"+"\n");


        StringBuffer s5 = new StringBuffer();
        StringBuffer s6 = new StringBuffer();
        s5.append(c + " * ");
        s6.append(b + " = " + (c * b));
        System.out.print(s5);
        System.out.print(s6+"\n");
        s6.replace(3,5,"равно ");
        System.out.print(s5);
        System.out.print(s6+"\n");
    }
}








//
//                    StringBuilder str = new StringBuilder("tutorials ");
//                    System.out.println("string = " + str);
//
//                    // appends the string argument to the StringBuilder
//                    str.append("point");
//
//                    // print the StringBuilder after appending
//                    System.out.println("After append = " + str);
//
//                    str = new StringBuilder("1234 ");
//                    System.out.println("string = " + str);
//
//                    // appends the string argument to the StringBuilder
//                    str.append("!#$%");
//
//                    // print the StringBuilder after appending
//                    System.out.println("After append = " + str);



//
//            StringBuffer sb = new StringBuffer("Тест");
//            sb.append(" StringBuffer");
//            System.out.println(sb);
//
//        StringBuffer strBuffer = new StringBuffer("word");
//
//        strBuffer.insert(3, 'l');
//        System.out.println(strBuffer.toString()); //world
//
//        strBuffer.insert(0, "s");
//        System.out.println(strBuffer.toString()); //sworld
