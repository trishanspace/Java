import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Comparator;
// 3. Доделать начатое на семинаре. Пройтись по списку из задания 2 и удалить повторяющиеся элементы.

public class task3 {

    public static void main(String[] args) {
        String[] arrPlanet = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto" };
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(arrPlanet[random.nextInt(9)]);
        }
        // System.out.println(list);
        Set<String> set = new HashSet<>(list); //удаление повторений
        list.clear();
        list.addAll(set);

        StringBuilder sb = new StringBuilder();
        list.sort(Comparator.naturalOrder());
        // System.out.println(list);
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
            } else {
                sb.append(list.get(i))
                        .append(": ")
                        .append(count)
                        .append("; ");
                count = 1;
            }
        }
        sb.append((list.get(list.size() - 1) + ": ")).append(count).append(".");
        System.out.println(sb);
    }
}