public class EmployeeManager {
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add Employee – O(1)
    public void addEmployee(Employee employee) {
        if (size >= employees.length) {
            System.out.println("Cannot add more employees. Array is full.");
            return;
        }
        employees[size++] = employee;
        System.out.println("Employee added.");
    }

    // Search Employee by ID – O(n)
    public Employee searchEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse Employees – O(n)
    public void displayAllEmployees() {
        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }
        for (int i = 0; i < size; i++) {
            employees[i].display();
        }
    }

    // Delete Employee by ID – O(n)
    public void deleteEmployee(int id) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee not found.");
            return;
        }

        // Shift remaining elements
        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[--size] = null; // Optional: clear last slot
        System.out.println("Employee deleted.");
    }
}
