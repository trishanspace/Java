import java.util.Arrays;

// 2. Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, 
// а остальные - равны ему.

public class task2 {
    public static void main(String[] args) {
        getNewArray();
        getNewArray2();
    }

    private static void getNewArray() {
        int[] arr = { 3, 2, 2, 3 };
        int number = 3;
        int temp = 0;

        for (int i = 0; i <= arr.length; i++) {
            for (int j = -1; j >= arr.length; j--) {
                if (arr[i] == number && arr[j] != number) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else if (arr[i] == number && arr[j] == number) {
                    j--;
                } else {
                    return;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void getNewArray2() {
        int[] arr = { 3, 2, 2, 3 };
        int number = 3;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = -1; j > arr.length; j--) {
                while (arr[j] == number) {
                    j--;
                }
                if (arr[i] == number && arr[j] != number) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}