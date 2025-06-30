public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");
        student.setId("S123");
        student.setGrade("A");

        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        System.out.println("\nUpdating student grade...");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}
