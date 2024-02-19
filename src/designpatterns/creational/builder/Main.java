package designpatterns.creational.builder;

/**
 * This is a Creational Design Pattern
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new StudentBuilder()
                .setName("Karan")
                .setFatherName("XYZ")
                .setMotherName("ABC")
                .setAddress("MAJDKBC")
                .setRollNumber("KSD")
                .build();

        Student student2 = new StudentBuilder()
                .setName("Pranav")
                .setFatherName("DXXZ")
                .setMotherName("AYUXC")
                .setAddress("MJKIpOOOBC")
                .setRollNumber("123D")
                .build();

        System.out.println(student1);
        System.out.println(student2);
    }
}
