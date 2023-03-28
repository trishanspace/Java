import java.util.Scanner;
import java.util.Date;
// 3*. В консоли запросить имя пользователя. В зависимости от текущего времени, 
// вывести приветствие вида:

// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

public class task3 {
    public static void main(String[] args) {
        getTime();
    }

    private static void getTime() {
        Scanner scanner = new Scanner(System.in); // ввод переменных
        String name = scanner.nextLine();
        Date date = new Date();

        System.out.printf("Привет, %s", name); // форматированный вывод
        System.out.println();
        System.out.println(date); // Вс, 24 декабря 16:34:27 PDT 2017
    }
}
