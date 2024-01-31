package OOPS.Abstraction;

public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Assistant();
        teacher.giveAssignment();
        teacher.teach();
    }
}
