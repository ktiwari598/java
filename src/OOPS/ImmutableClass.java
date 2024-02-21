package OOPS;

import java.util.ArrayList;
import java.util.List;

/**
 * For making a class Immutable,
 * 1. Class should be marked as final -> This prevents the class from being subclassed and potentially modified.
 * 2. Make fields as private and final
 * 3. Provide only getter methods
 * 4. Ensure deep copy for mutable objects: If the class contains references to mutable objects(List, Set, etc), make
 * sure to return deep copies of these objects to prevent modifications from external sources.
 */

public final class ImmutableClass {
    private final String field1;
    private final String field2;
    private final List<String> names;

    public ImmutableClass(String field1, String field2, List<String> names) {
        this.field1 = field1;
        this.field2 = field2;
        this.names = new ArrayList<>(names);
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public List<String> getNames() {
        return new ArrayList<>(names);
    }
}
