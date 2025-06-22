import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(100);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            int id;
            String name, position;
            double salary;

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    id = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    name = scanner.next();
                    System.out.print("Enter Position: ");
                    position = scanner.next();
                    System.out.print("Enter Salary: ");
                    salary = scanner.nextDouble();
                    manager.addEmployee(new Employee(id, name, position, salary));
                    break;

                case 2:
                    System.out.print("Enter ID to search: ");
                    id = scanner.nextInt();
                    Employee e = manager.searchEmployee(id);
                    if (e != null) e.display();
                    else System.out.println("Employee not found.");
                    break;

                case 3:
                    manager.displayAllEmployees();
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    id = scanner.nextInt();
                    manager.deleteEmployee(id);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
