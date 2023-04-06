import java.util.Scanner;
// 1. Реализовать консольное приложение, которое:

// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, 
// а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

public class task1 {

    public static void main(String list) {
        // LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        StringBuilder sb = new StringBuilder(list);

        if (inputs.equals("print")) {

            char first = sb.charAt(0);
            sb.setCharAt(0, sb.charAt(sb.length() - 1));
            sb.setCharAt(sb.length() - 1, first);
            sb.toString();
            System.out.println(sb);

        } else if (inputs.equals("revert")) {
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb);
        } else{
            System.out.println(inputs);
        }
    }
}