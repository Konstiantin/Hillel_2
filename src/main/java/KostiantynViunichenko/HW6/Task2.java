package KostiantynViunichenko.HW6;

/*Создать массив целых чисел.
        В созданном массиве найти:
        а) среднее арифметическое
        b) сумму всех элементов
        с) количество элементов между максимальным и
        минимальным элементом.
        Вывести результаты в виде:
        “Среднее арифметическое”:5.5
        “Сумма всех элементов”: 345
        “Количество элементов между максимальным и минимальным
        элементом”: 5
*/
public class Task2 {
    public static void main(String[] args) {

        int[] arr = {3, 12, 45, 8, -1, 7, 5, 8};
        int res1 = 0;
        int res2 = 0;
        int index_min = 0;
        int index_max = 0;
        int count = 0;
        int min = 0;
        int max = 0;


        for (int i = 0; i < arr.length; i++) {
            res1 = res1 + arr[i];
        }
        res1 = res1 / arr.length;
        System.out.println("Среднее арифметическое =  " + res1);
        for (int i = 0; i < arr.length; i++) {
            res2 = res2 + arr[i];
        }
        System.out.println("Сумма элементов массива = " + res2);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index_min = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                index_max = i;
            }
            count = index_max - index_min;
            if (count < 0) {
                count = -count;
            }
            if (count != 0) {
                count = count - 1;
            }
        }
        System.out.println("Количество " + count);
    }
}