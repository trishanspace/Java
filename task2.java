import java.util.*;;

// 2. Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, 
// а остальные - равны ему.

public class task2 {
    public static void main(String[] args) {
        moveElementToEnd(3, 2, 2, 3, 3);
    }

    private static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        for (int i = 0, lastElementIndex = array.size() - 1; i <= lastElementIndex;) {
            if (array.get(i) == toMove) {
                array.remove(i);
                array.add(toMove);
                lastElementIndex--;
            } else {
                i++;
            }
        }
        return array;
    }
}