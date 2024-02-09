package OOPS;

import SerializationDeSerialization.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

    private static void deserialize() {
        try {
            //get the reference of the byte stream file
            FileInputStream fileInputStream = new FileInputStream("encoded.txt");

            //convert the byte stream file to object state
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student student = (Student) objectInputStream.readObject();
            student.printName();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception occurred while deserializing file");
        }
    }

    public static void main(String[] args) {
        deserialize();
    }
}
