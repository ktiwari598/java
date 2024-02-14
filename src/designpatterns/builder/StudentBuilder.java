package designpatterns.builder;

public class StudentBuilder {
    private String name;
    private String fatherName;
    private String motherName;
    private String rollNumber;
    private String address;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setRollNumber(String rollNo) {
        this.rollNumber = rollNo;
        return this;
    }

    public Student build() {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getAddress() {
        return address;
    }
}
