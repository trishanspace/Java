import java.util.Scanner;

// 1. Напишите метод, который принимает на вход строку (String) и 
// определяет является ли строка палиндромом (возвращает boolean значение).

public class task1 {
    public static void main(String[] args) {
        printString();
        reverseString("");
        isPalindrome("");
    }

    private static void printString() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        isPalindrome(str);
    }

    private static String reverseString(String str) {
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; --i)
            revStr += str.charAt(i);
        return revStr;
    }

    private static Boolean isPalindrome(String str) {
        if (str.equals(reverseString(str))) {
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
        return str.equals(reverseString(str));      
    }  //break?
}