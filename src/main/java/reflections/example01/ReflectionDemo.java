package reflections.example01;

// Importing necessary classes for reflection
import jdk.jshell.tool.JavaShellToolBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws ReflectiveOperationException {
        // Creating an instance of Person class
        Person person = new Person();
        person.displayDetails();

        // Obtain the Class object to get information about the Person class
        Class<?> clazz = person.getClass();

        // Access and modify the private field "name"
        Field fieldName = clazz.getDeclaredField("name");
        fieldName.setAccessible(true); // Make the field accessible
        fieldName.set(person, "Ana"); // Set the field's value to "Ana"

        // Access and modify the private field "age"
        Field fieldAge = clazz.getDeclaredField("age");
        fieldAge.setAccessible(true); // Make the field accessible
        fieldAge.setInt(person, 30); // Set the field's value to 30

        // Access and invoke the private method "displayDetails"
        Method printMethod = clazz.getDeclaredMethod("displayDetails");
        printMethod.setAccessible(true); // Make the method accessible
        printMethod.invoke(person); // Invoke the method on the person instance
    }
}
