import java.util.Random;

// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        getExstrimValues(5);
    }

    public static void getExstrimValues(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-10, 11);
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}