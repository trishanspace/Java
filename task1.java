import java.util.Scanner;
import java.util.ArrayList;

// 1. Реализовать консольное приложение, которое:

// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, 
// а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

public class task1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("print")) {
                String temp1 = list.get(list.size()-1);
                list.remove(list.size()-1);
                list.add(0, temp1);

                String temp2 = list.get(1);
                list.remove(1);
                list.add(list.size(), temp2);

            } else if (input.equals("revert")) {
                list.remove(list.size()-1);
            } else {
                list.add(input);
            }
            System.out.println(list);
        }
    }
}
