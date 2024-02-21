package OOPS;

import SerializationDeSerialization.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String field1 = "FF";
        String field2 = "FGFH";
        List<String> names = new ArrayList<>() {{add("kKKK"); add("KOIOLJJ");}};
        ImmutableClass immutableClass = new ImmutableClass(field1, field2, names);
        System.out.println(immutableClass.getField1());
        immutableClass.getNames().set(0, "XYZ");
        for(String str: immutableClass.getNames()) {
            System.out.printf("%s ", str);
        }
    }
}
