package KostiantynViunichenko.HW7;

//Посчитать результат выражений. Между числами могут быть
//        слова только "plus" and "minus"
//        String s1 = "1 plus 5";
//        String s2 = "6 minus 5";
//        String s3 = "8 plus 10";
//        String s4 = "16 minus 5";
//        Результат вывести на консоль в виде:
//        “1 plus 5 = 6”

public class Task3 {

    public static void main(String[] args) {

        String s1 = "1 plus 5";
        String s2 = "4 minus 3";
        String s3 = "8 plus 10";
        String s4 = "16 minus 5";

        int r = s1.indexOf("plus");
        String strA = s1.substring(0, r - 1);
        String strB = s1.substring(r + 5);

        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);
        System.out.println(s1+" = "+(a+b));

        int q = s2.indexOf("minus");
        String strC = s2.substring(0, q - 1);
        String strD = s2.substring(q + 6);

        int c = Integer.parseInt(strC);
        int d = Integer.parseInt(strD);
        System.out.println(s2+" = "+(c-d));

        int w = s3.indexOf("plus");
        String strX = s3.substring(0, w - 1);
        String strY = s3.substring(w + 5);

        int x = Integer.parseInt(strX);
        int y = Integer.parseInt(strY);
        System.out.println(s3+" = "+(x+y));

        int j = s4.indexOf("minus");
        String strK = s4.substring(0, j - 1);
        String strH = s4.substring(j + 6);

        int k = Integer.parseInt(strK);
        int h = Integer.parseInt(strH);
        System.out.println(s4+" = "+(k-h));
    }
}


