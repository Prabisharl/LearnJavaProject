package org10.example.abstraction.interfaceExample.privatemethod;

// Interface with static and private static methods
interface Example {

    // Static method accessible via interface name
    static void display() {
        System.out.println("[INFO] display() method called.");
        logStatic(); // Calls private static helper
    }

    // Private static method used internally by interface
    private static void logStatic() {
        System.out.println("[LOG] Private static method executed.");
    }
}

public class PrivateInStaticJavaNinePlus {
    public static void main(String[] args) {
        Example.display(); // Only static method is directly accessible
    }
}
