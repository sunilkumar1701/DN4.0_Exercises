public class TaskManager {
    private TaskNode head;

    public TaskManager() {
        this.head = null;
    }

    // Add task at end – O(n)
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Task added.");
    }

    // Search task by ID – O(n)
    public Task searchTask(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.taskId == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Display all tasks – O(n)
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks found.");
            return;
        }
        TaskNode current = head;
        while (current != null) {
            current.task.display();
            current = current.next;
        }
    }

    // Delete task by ID – O(n)
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("No tasks to delete.");
            return;
        }

        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        TaskNode current = head;
        while (current.next != null && current.next.task.taskId != taskId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Task deleted.");
        }
    }
}
