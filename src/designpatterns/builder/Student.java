package designpatterns.builder;

public class Student {
    private final String name;
    private final String fatherName;
    private final String motherName;
    private final String rollNumber;
    private final String address;

    //Constructor takes Builder instead of fields
    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.getName();
        this.fatherName = studentBuilder.getFatherName();
        this.motherName = studentBuilder.getMotherName();
        this.address = studentBuilder.getAddress();
        this.rollNumber = studentBuilder.getRollNumber();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
