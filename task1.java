import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;
import java.util.Map;
import java.util.HashSet;
// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2. Создать множество ноутбуков (ArrayList).
// 3. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. 
// Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет. 
// Выводить только те ноутбуки, что соответствуют условию

public class task1 {
    private static HashMap<Integer, String> criteria = new HashMap();

    private int memoryPC;
    private int hardDrive;
    private String color;
    private String manufacturer;
    private String model;
    private String os;

    public task1(int memoryPC, int hardDrive, String color, String manufacturer, String model, String os) {
        this.memoryPC = memoryPC;
        this.hardDrive = hardDrive;
        this.color = color;
        this.manufacturer = manufacturer;
        this.model = model;
        this.os = os;
    }

    public static void main(String[] args) {
        Set<task1> laptops = new HashSet<>();
        laptops.add(new task1(512, 512, "gray", "Maibenben", "M543", "Linux"));
        laptops.add(new task1(1024, 1024, "white", "Mac", "Pro", "MacOS"));
        laptops.add(new task1(512, 1024, "blue", "Acer", "1124", "Win"));
        laptops.add(new task1(1024, 1024, "black", "Mac", "Pro", "MacOS"));

        HashMap<Integer, String> filteringCriteria = new HashMap<>();
        numeringValues();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующего критерия или 0: ");
        System.out.println(criteria);

        while (true) {
            int command = scanner.nextInt();
            if (0 == command) {
                Set<task1> result = filter(laptops, filteringCriteria);
                if (!result.isEmpty())
                    System.out.println(result);
                else
                    System.out.println(laptops);
                break;
            } else if (criteria.containsKey(command)) {
                System.out.println("Введите значение параметра: ");
                String value = scanner.next();
                filteringCriteria.put(command, value);
            } else {
                System.out.println("Не тот критерий: ");
            }
        }
    }

    private static Set<task1> filter(Set<task1> laptops, HashMap<Integer, String> filteringCriteria) {
        if (null != filteringCriteria && !filteringCriteria.isEmpty()) {
            for (Map.Entry<Integer, String> criterion : filteringCriteria.entrySet()) {
                if (criteria.containsKey(criterion.getKey())) {
                    return filterLaptop(laptops, criteria.get(criterion.getKey()), criterion.getValue());
                }
            }
        }
        return laptops;
    }

    private static Set<task1> filterLaptop(Set<task1> laptops, String criterionName, String criterionValue) {
        Set<task1> result = new HashSet<>();

        for (task1 laptop : laptops) {
            if ("PC memory".equals(criterionName) && laptop.getMemoryPC() >= Integer.parseInt(criterionValue))
                result.add(laptop);
            else if ("Hard Drive".equals(criterionName) && laptop.getHardDrive() >= Integer.parseInt(criterionValue))
                result.add(laptop);
            else if ("Color".equals(criterionName) && laptop.getColor().equalsIgnoreCase(criterionValue))
                result.add(laptop);
            else if ("OS".equals(criterionName) && laptop.getOS().equalsIgnoreCase(criterionValue))
                result.add(laptop);
            else if ("Manufacturer".equals(criterionName) && laptop.getManufacturer().equalsIgnoreCase(criterionValue))
                result.add(laptop);
        }
        return result;
    }

    private static void numeringValues() {
        criteria.put(1, "PC memory");
        criteria.put(2, "Hard Drive");
        criteria.put(3, "Color");
        criteria.put(4, "OS");
        criteria.put(5, "Manufacturer");
    }

    public int getMemoryPC() {
        return memoryPC;
    }

    public void setMemoryPC(int memoryPC) {
        this.memoryPC = memoryPC;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOS() {
        return os;
    }

    public void setOS(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Laptop: " +
                "PC memory = " + memoryPC +
                ", Hard Drive = " + hardDrive +
                ", Color = " + color +
                ", Manufacturer = " + manufacturer +
                ", Model = " + model +
                ", OS = " + os;
    }
}