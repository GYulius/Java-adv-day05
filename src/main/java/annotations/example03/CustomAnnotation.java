package annotations.example03;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the CustomAnnotation annotation
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface CustomAnnotation {
    String value() default "Value default";

    // Define a nested annotation NewAnnotation inside CustomAnnotation
    public @interface NewAnnotation {
        String otherValue() default "Other";
    }
}