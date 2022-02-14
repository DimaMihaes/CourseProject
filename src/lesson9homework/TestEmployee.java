package lesson9homework;

public class TestEmployee {
    public static void main(String[] args) {

        Employee[] arr = new Employee[3];
        arr[0] = new Employee(2001, 3000, "Andrew", "LLL\n");
        arr[1] = new Employee(1996, 5000, "John", "LLL\n");
        arr[2] = new Employee(2004, 2000, "Robert", "LLL\n");

        for (Employee employee : arr) {
            employee.display();
        }
    }
}
