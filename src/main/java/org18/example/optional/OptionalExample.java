package org18.example.optional;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        // 1. of() - with non-null value
        Optional<String> name1 = Optional.of("Prabisha");
        System.out.println("Using of(): " + name1);

        // 2. ofNullable() - with non-null value
        Optional<String> name2 = Optional.ofNullable("Java");
        System.out.println("Using ofNullable() with non-null: " + name2.get());

        // 3. ofNullable() - with null value
        Optional<String> name3 = Optional.ofNullable(null);
        System.out.println("Using ofNullable() with null: " + name3);

        // 4. isPresent()
        if (name1.isPresent()) {
            System.out.println("isPresent(): Name is available - " + name1.get());
        } else {
            System.out.println("isPresent(): Name is not available");
        }

        // 5. ifPresent()
        name2.ifPresent(n -> System.out.println("ifPresent(): Name length is " + n.length()));

        // 6. orElse()
        String result = name3.orElse("Default Name");
        System.out.println("orElse(): " + result);
    }
}
