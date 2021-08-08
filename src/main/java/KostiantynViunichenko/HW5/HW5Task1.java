package KostiantynViunichenko.HW5;

public class HW5Task1 {
    public static void div(int a, int b) {
        System.out.println(" Помните - деление на 0 не возможно!!!");
        System.out.println(" Вы ввели: " + a + " и " + b);
        int c;
        if ((b == 0) || (a == 0)) {
            System.out.println(" Вы ввели 0  -  деление на 0 не возможно!!!!");
        }
        c=a/b;
        if (c!=0)
            System.out.println(" Результат = " + c);
    }
    public static void main(String[] args) {
        div(4, -2);
    }
}
