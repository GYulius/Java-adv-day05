package annotations.example03;

// Define the MyClass class with annotated methods
public class MyClass {

    // Annotate methodOne with CustomAnnotation
    @CustomAnnotation(value = "Method one")
    public void methodOne() {
        System.out.println("Executing first method");
    }

    // Annotate methodTwo with CustomAnnotation
    @CustomAnnotation(value = "Method two")
    public void methodTwo() {
        System.out.println("Executing second method");
    }

    // Annotate methodThree with NewAnnotation inside CustomAnnotation
    @CustomAnnotation.NewAnnotation(otherValue = "Other value")
    public void methodThree() {
        System.out.println("Executing third method");
    }
}
