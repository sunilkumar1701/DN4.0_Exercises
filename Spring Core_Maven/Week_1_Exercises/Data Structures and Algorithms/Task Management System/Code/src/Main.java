import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Display All Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            int id;
            String name, status;

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    id = scanner.nextInt();
                    System.out.print("Enter Task Name: ");
                    name = scanner.next();
                    System.out.print("Enter Task Status: ");
                    status = scanner.next();
                    manager.addTask(new Task(id, name, status));
                    break;

                case 2:
                    System.out.print("Enter Task ID to search: ");
                    id = scanner.nextInt();
                    Task task = manager.searchTask(id);
                    if (task != null) task.display();
                    else System.out.println("Task not found.");
                    break;

                case 3:
                    manager.displayTasks();
                    break;

                case 4:
                    System.out.print("Enter Task ID to delete: ");
                    id = scanner.nextInt();
                    manager.deleteTask(id);
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
