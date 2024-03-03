import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("MSI Katana", "Windows 11", 2023, true, "black", 17.3, "i5", 16, 512, 2600, 110_000);
        Laptop laptop2 = new Laptop("HUAWEI MateBook", "Windows 11", 2023, false, "gray", 15.6,  "i5", 8, 256, 1560, 55_000);
        Laptop laptop3 = new Laptop("ASUS TUF", "Windows 11", 2023, true, "black", 15.6,  "i7", 16, 512, 2300, 88_000);
        Laptop laptop4 = new Laptop("GIGABYTE G5", "Windows 11", 2023, true, "black", 15.6,  "i5", 16, 512, 2080, 90_000);
        Laptop laptop5 = new Laptop("ASUS VivoBook", "Windows 11", 2023, false, "gray", 15.6,  "i5", 16, 512, 2080, 65_000);
        Laptop laptop6 = new Laptop("DEXP Aquilon", "Windows 11 Home", 2023, false, "gray", 14.1,  "UHD", 8, 256, 1500, 17_000);
        Laptop laptop7 = new Laptop("OSiO FocusLine", "Windows 11", 2023, false, "gray", 15.6,  "i3", 8, 256, 1700, 37_000);
        Laptop laptop8 = new Laptop("ASUS ROG", "Windows 11", 2023, true, "gray", 18.0,  "i9", 32, 2024, 3100, 400_000);
        Laptop laptop9 = new Laptop("OSiO FocusLine", "Windows 11", 2023, false, "gray", 15.6,  "i3", 8, 256, 1700, 37_000);
        Laptop laptop10 = new Laptop("OSiO FocusLine", "Windows 11", 2023, false, "gray", 15.6,  "i3", 8, 256, 1700, 37_000);
        Laptop laptop11 = new Laptop("OSiO FocusLine", "Windows 11", 2023, false, "gray", 15.6,  "i3", 8, 256, 1700, 37_000);
        
        Set<Laptop> laptopSet = new HashSet<>();
        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);
        laptopSet.add(laptop4);
        laptopSet.add(laptop5);
        laptopSet.add(laptop6);
        laptopSet.add(laptop7);
        laptopSet.add(laptop8);
        laptopSet.add(laptop9);
        laptopSet.add(laptop10);
        laptopSet.add(laptop11);
          
        setFilter(laptopSet);

    }

    public static void setFilter(Set<Laptop> laptopSet) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номера фильтров для выбора ноутбука через запятую");
        System.out.println("1 - ОЗУ\n2 - Объем жесткого диска\n3 - диагональ экрана\n4 - операционная система\n5 - цвет");
        String numberFilter = scanner.nextLine();
        String[] filters = numberFilter.split(",");
        Map<String, String> filterValues = new HashMap<>();

        for (String filter : filters) {
            switch (filter.trim()) {
                case "1":
                    System.out.println("Введите минимальный объем ОЗУ:");
                    filterValues.put("ram", scanner.nextLine());
                    break;
                case "2":    
                    System.out.println("Введите минимальный объем жесткого диска:");
                    filterValues.put("ssd", scanner.nextLine());
                    break;
                case "3":    
                    System.out.println("Введите минимальную диагональ экрана:");
                    filterValues.put("diagonal", scanner.nextLine());
                    break;
                case "4":    
                    System.out.println("Введите название операционной системы:");
                    filterValues.put("os", scanner.nextLine());
                    break;
                case "5":    
                    System.out.println("Введите цвет:");
                    filterValues.put("color", scanner.nextLine());
                    break;
            }
        }
        scanner.close();

        Set<Laptop> laptopsFilter = new HashSet<>();
        for (Laptop laptop : laptopSet) {
            if ((!filterValues.containsKey("ram") || laptop.getVolumeRAM() >= Integer.parseInt(filterValues.get("ram")))
                && (!filterValues.containsKey("ssd") || laptop.getVolumeSSD() >= Integer.parseInt(filterValues.get("ssd")))
                && (!filterValues.containsKey("diagonal") || laptop.getDiagonal() >= Integer.parseInt(filterValues.get("diagonal")))
                && (!filterValues.containsKey("os") || laptop.getOperatingSystem().equalsIgnoreCase(filterValues.get("os")))
                && (!filterValues.containsKey("color") || laptop.getColor().equalsIgnoreCase(filterValues.get("color")))) {
                laptopsFilter.add(laptop);
            }
        }
     
        for (Laptop laptop : laptopsFilter) {
            System.out.println(laptop);

        }

    }
}
