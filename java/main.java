import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        // 1. Работа с Университетом (Агрегация)
        University vsu = new University();
        System.out.print("Введите название университета: ");
        vsu.setName(scanner.nextLine());
        
        // 2. Работа с Деканом (Наследование от Employee)
        Dean dean = new Dean();
        System.out.print("Введите имя декана: ");
        dean.setName(scanner.nextLine());
        
        // 3. Работа с Проектом
        Project lab = new Project();
        lab.setName("Разработка UML-модели");
        
        // Вывод всей структуры (Шаг 6)
        System.out.println("\n--- Отчет по системе ---");
        System.out.println("Университет: " + vsu.getName());
        System.out.println("Декан факультета: " + dean.getName());
        System.out.println("Текущий проект: " + lab.getName());
    }
}