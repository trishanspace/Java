import java.io.*;
// 2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
// который запишет эту строку в простой текстовый файл, обработайте исключения.

public class task2 {

    public static void main(String[] args) {
        writeToFile();
    }
    private static void writeToFile() {
        try (FileWriter writer = new FileWriter("note.txt", false)) {
            String text = "TEST ";
            writer.write(text.repeat(100));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}