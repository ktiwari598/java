package SerializationDeSerialization;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String rollNo;
    private transient Integer age;
    private String address;
    private String lastName;

    public Student() {
    }

    public Student(String name, String rollNo, int age, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void printName() {
        System.out.println("My namwdecdfdv efrvv fdvvvbgjyujujm,b gnyum e i fdcdsc Tiwari");
    }
}
