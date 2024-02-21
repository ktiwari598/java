package garbagecollection.trywithresources;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /**
         * This is try with resources, here the resource closing for FileReader object is done automatically done by Java
         * Resources that are opened within the parentheses of the try block are automatically closed,
         * regardless of whether an exception is thrown or not, thus preventing from resource leaks
         */
        try(FileReader reader = new FileReader("encoded.txt")) {
            int charcter;
            while((charcter = reader.read()) != -1) {
                System.out.printf("%c", (char) charcter);
            }
        } catch (IOException e) {
            System.out.println("IOException occurred while reading file");
        }
    }
}
