import java.util.HashMap;

// 2. Пусть дан список сотрудников:
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.
public class task2 {

    private HashMap<String, Integer> names = new HashMap<>();

    public void namesStaff() {
        putName("Иван Иванов");
        putName("Светлана Петрова");
        putName("Кристина Белова");
        putName("Анна Мусина");
        putName("Анна Крутова");
        putName("Иван Юрин");
        putName("Петр Лыков");
        putName("Павел Чернов");
        putName("Петр Чернышов");
        putName("Мария Федорова");
        putName("Марина Светлова");
        putName("Мария Савина");
        putName("Мария Рыкова");
        putName("Марина Лугова");
        putName("Анна Владимирова");
        putName("Иван Мечников");
        putName("Петр Петин");
        putName("Иван Ежов");

    }
    
    public void putName(String name) {
        if (names.containsKey(name)) {
            names.put(name, names.get(name) + 1);
        } else{
        names.put(name, 1);
        }
        System.out.println(names);
    }
}
