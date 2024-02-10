package SerializationDeSerialization;

import java.io.*;


/**
 * Serialization is the process of converting object state to byte stream.
 * Deserialization is the process of converting byte stream to object state.
 * transient keyword is used to prevent the field from being serialized
 */
public class Main {

    private static void serialize(Student student) {
        //create a file output stream where the object state will be stored
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("encoded.txt");

            //convert the object state to byte stream
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("File serialized successfully to encoded.txt!!");
        } catch (IOException e) {
            System.out.println("Exception occurred while serializing file : " + e);
        }
    }

    private static void deserialize() {
        try {
            //get the reference of the byte stream file
            FileInputStream fileInputStream = new FileInputStream("encoded.txt");

            //convert the byte stream file to object state
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student student = (Student) objectInputStream.readObject();
            student.printName();
            System.out.println(student);
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getRollNo());
            System.out.println(student.getAddress());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception occurred while deserializing file" + e);
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Karan", "2018114", 24, "Anai");
       // serialize(student);
        deserialize();
    }
}
