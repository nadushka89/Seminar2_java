import java.io.IOException;
import java.util.logging.*;
// 2 . Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

public class Task02_02Home {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task02_02Home.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int[] array = { 50, 3, 1, -7, 3, 64, 0, 9, -3, 85, 7 };
        printArrayInt(array);
        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        printArrayInt(newArr);
    }
    // сортируем массив
    public static int[] listSort(int[] arr) {
        for (int k = 0; k < arr.length - 1; k++) {

            for (int i = 0; i < arr.length - k - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
    // печать массива
    public static void printArrayInt(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.print(arr[arr.length-1]);
    }
}
