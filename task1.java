import java.util.HashMap;
import java.util.ArrayList;

// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 
// 1 человек может иметь несколько телефонов.

public class task1 {

    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> values = new ArrayList<>();
            values.add(phoneNum);
            phoneBook.put(name, values);
        }
    }

    public ArrayList<Integer> find(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return new ArrayList<Integer>();
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
    public static void main(String[] args) {
        task1 phoneBook = new task1();
        phoneBook.add("Петров", 12345);
        phoneBook.add("Петров", 54321);
        phoneBook.add("Сидоров", 82305);
        System.out.println(task1.getPhoneBook());
    }
}