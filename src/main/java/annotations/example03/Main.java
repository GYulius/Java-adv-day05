package annotations.example03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Main class to demonstrate the use of annotations and reflection
public class Main {

    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass myClass = new MyClass();

        // Iterate over all declared methods in MyClass
        for (Method method : MyClass.class.getDeclaredMethods()) {
            // Check if the method is annotated with CustomAnnotation
            if (method.isAnnotationPresent(CustomAnnotation.class)) {
                // Get the CustomAnnotation instance
                CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
                // Print the method name and annotation value
                System.out.println("Method " + method.getName() + " with annotation " + annotation.value());
                try {
                    // Invoke the method on the myClass instance
                    method.invoke(myClass);
                } catch (ReflectiveOperationException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}