import java.util.ArrayList;
// /**
//  * 1. Пусть дан произвольный список целых чисел, удалить из него четные числа 
//  * (в языке уже есть что-то готовое для этого)
/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(4);
        list.add(2);
        list.add(17);
        // System.out.println(list);
        list.removeIf(i -> i % 2 == 0);

        System.out.println(list);
    }
}