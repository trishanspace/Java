import java.util.ArrayList;
import java.util.Collections;

/**
 * 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное
 * и среднее арифметическое из этого списка.
 */
public class task2 {
    public static void main(String[] args) {
        extremeValuesAverage();
    }

    private static void extremeValuesAverage() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        // list.add(8904);
        // list.add(-3);
        list.add(17);
        // list.add(0);

        double sum = 0;
        double average;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        average = sum / list.size();
        
        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));
        System.out.println("Average: " + average);
    }
}