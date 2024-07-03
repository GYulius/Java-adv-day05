package annotations.example02;

public class Main {
    public static void main(String[] args) {
        // Obtain the Class object for MyComponent
        Class<MyComponent> obj = MyComponent.class;

        // Check if the ComponentInfo annotation is present on the MyComponent class
        if (obj.isAnnotationPresent(ComponentInfo.class)) {
            // Retrieve the ComponentInfo annotation from the MyComponent class
            ComponentInfo info = obj.getAnnotation(ComponentInfo.class);

            // Print the values of the annotation's elements
            System.out.println("Numele componentului " + info.name());
            System.out.println("Data " + info.date());
            System.out.println("Versiunea curenta " + info.currentVersion());
        }
    }
}