package annotations.example01;

// Apply the Component annotation to the MyClass class with specified description and value
@Component(description = "This is a simple annotation", value = 100)
public class MyClass {

    // Apply the Component annotation to the myField field with a specified description
    @Component(description = "This is description for the field")
    private String myField;

    // The MyClass class body can contain fields, methods, and other components
}
