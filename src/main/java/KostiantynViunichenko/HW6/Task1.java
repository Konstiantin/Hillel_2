package KostiantynViunichenko.HW6;

/* Счастливый билет.
        Дан массив с 6 элементами типа int. Определить, является билет
        счастливым. Билет является счастливым, если сумма первых трех
        чисел сумме 4го, 5го и 6го числа.
        Числа должны быть в промежутке от 0 до 9 включительно.
        В результате вывести текст (пример):
        “Билет счастливый: true”
*/

public class Task1 {
    public static void main(String[] args) {
        int[] array = {0, 5, 7, 1, 2, 9};
        Task1.printTicket(array);

    }

    private static void printTicket(int[] array) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 3; i++) {
            sum1 = sum1 + array[i];
        }
        for (int i = 3; i < 6; i++) {
            sum2 = sum2 + array[i];
        }
        if (sum1 == sum2) {
            System.out.println("Билет счасливый: True");
        } else {
            System.out.println("Билет счасливый: False ");
        }
    }
}
