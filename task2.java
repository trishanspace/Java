import java.util.LinkedList;
import java.util.Stack;

//  2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, 
//  который вернет “перевернутый” список.

/**
 * task2
 */
public class task2 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        Stack<Integer> stack = new Stack<>();
        stack.addAll(list);
        list.clear();
        while (!stack.empty()) //пустой
            list.add(stack.pop());
        System.out.println(list);
    }
}