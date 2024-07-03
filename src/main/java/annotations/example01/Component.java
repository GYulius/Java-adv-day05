package annotations.example01;
// Define the Component annotation with a description element and an optional value element
public @interface Component {
    // Description element for the annotation
    String description();

    // Value element for the annotation with a default value of 42
    int value() default 42;
}