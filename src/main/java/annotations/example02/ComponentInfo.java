package annotations.example02;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the ComponentInfo annotation with runtime retention
@Retention(RetentionPolicy.RUNTIME)
public @interface ComponentInfo {
    // Annotation elements
    String name();
    String date();
    int currentVersion();
}