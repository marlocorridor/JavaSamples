# MethodOverloading

This directory demonstrates the concept of **method overloading** in programming. Method overloading allows multiple functions to have the same name but different parameters (type, number, or both).

## Contents

### 1. `Calculator.java`
- **Description:** Contains overloaded methods for performing arithmetic operations.
- **Functions:**
  - `add(int a, int b)`: Adds two integers.
  - `add(double a, double b)`: Adds two doubles.
  - `add(int a, int b, int c)`: Adds three integers.

### 2. `Printer.java`
- **Description:** Demonstrates method overloading by printing different types of data.
- **Functions:**
  - `print(String message)`: Prints a string message.
  - `print(int number)`: Prints an integer.
  - `print(double number)`: Prints a double value.

### 3. `Main.java`
- **Description:** Contains the main method to test the overloaded methods in `Calculator` and `Printer` classes.
- **Functions:**
  - `main(String[] args)`: Entry point; demonstrates usage of overloaded methods.

## Summary

This directory is a simple example to illustrate how method overloading works in Java. Each class provides overloaded methods to perform similar operations with different parameter lists.

## Advanced Implementations

### 4. Overloading with Generic Object Type
- **Description:** Methods can be overloaded to accept a generic `Object` parameter, allowing them to handle any type, but requiring type checks or casting within the method.
- **Example:**
  - `print(Object obj)`: Prints any object by calling its `toString()` method.

### 5. Pattern Matching (Java 16+)
- **Description:** Pattern matching with `instanceof` simplifies type checks and casting, making overloaded methods that accept `Object` more concise and safer.
- **Example:**
  - `if (obj instanceof String s) { ... }`

### 6. Switch Expressions vs. Regular Switch Case
- **Regular Switch Case:** Traditional `switch` statements require explicit `break` statements and can only be used with certain types.
- **Switch Expressions (Java 14+):** Allow returning values directly and support pattern matching, making code more concise and expressive.

### 7. Related Terms
- **Varargs:** Overloading methods using variable-length argument lists (e.g., `add(int... numbers)`).
- **Autoboxing:** Automatic conversion between primitive types and their wrapper classes can affect method resolution.
- **Covariant Return Types:** Overriding methods can return a subtype, but overloading is based on parameter lists, not return types.

These advanced techniques further extend the flexibility and power of method overloading in Java.