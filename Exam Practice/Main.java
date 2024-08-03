import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee(1003, "Alice", 50000);
        employees[1] = new Employee(1001, "Bob", 60000);
        employees[2] = new Employee(1002, "Charlie", 55000);

        System.out.println("Original array: ");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Arrays.sort(employees);

        System.out.println("Sorted");
        for (Employee e : employees) {
            System.out.println(e);
        }

    }
}
