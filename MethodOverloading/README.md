# MethodOverloading

This directory demonstrates the concept of **method overloading** in programming. Method overloading allows multiple functions to have the same name but different parameters (type, number, or both).

## Contents

### `Main.java`  
  - **Purpose:** The entry point of the program. Demonstrates **usage** of other classes and handles the main logic flow.
  - **Attributes:**
    - Scanner scanner
    - int data_type
    - int record_count
    - ValueGetter value_getter
    - ValueSorter value_sorter
  - **Methods:**
    - public static void main(String[] args)
    - public static void exitProgram(String message)

### `ValueGetter.java`  
  - **Purpose:** To get values from the user based on the specified data type (integer or string).
  - **Attributes:**
    - private final int TYPE_INT = 1
    - private final int TYPE_STRING = 2
    - private int data_type
    - private int record_count
    - private Scanner scanner
  - **Constructor**
    - public ValueGetter(int data_type, int record_count, Scanner scanner)
  - **Methods:**
    - private void askForValues()
    - private int[] getIntValues()
    - private String[] getStringValues()
    - public Object getValues()
    - public int getDataType()

### `ValueSorter.java`
  - **Purpose:** To sort values using overloaded methods for different data types (int, double, String, List<Integer>).
  - **Attributes:**
    - private final int TYPE_INT = 1
    - private final int TYPE_STRING = 2
    - private int data_type
    - private String[] string_values
    - private int[] int_values
  - **Constructor** _(overloaded)_
    - public ValueSorter(int data_type)
    - public ValueSorter(int data_type, String[] string_values)
    - public ValueSorter(int data_type, int[] int_values)
  - **Methods:**
    - public void sort()
    - public void printValues()
    - public void setValues(int[] int_values)  _(overloaded)_
    - public void setValues(String[] string_values)  _(overloaded)_

## Summary

This directory is a simple example to illustrate how method overloading works in Java. Each class provides overloaded methods to perform similar operations with different parameter lists.
Each file contains Java classes with examples of method overloading, illustrating how the same method name can be used for different parameter lists.

## Advanced Implementations

### Overloading with Generic Object Type
- **Description:** Methods can be overloaded to accept a generic `Object` parameter, allowing them to handle any type, but requiring type checks or casting within the method.
- **Example:**
  - `print(Object obj)`: Prints any object by calling its `toString()` method.

### Pattern Matching (Java 16+)
- **Description:** Pattern matching with `instanceof` simplifies type checks and casting, making overloaded methods that accept `Object` more concise and safer.
- **Example:**
  - `if (obj instanceof String s) { ... }`

### Switch Expressions vs. Regular Switch Case
- **Regular Switch Case:** Traditional `switch` statements require explicit `break` statements and can only be used with certain types.
- **Switch Expressions (Java 14+):** Allow returning values directly and support pattern matching, making code more concise and expressive.

### Related Terms
- **Varargs:** Overloading methods using variable-length argument lists (e.g., `add(int... numbers)`).
- **Autoboxing:** Automatic conversion between primitive types and their wrapper classes can affect method resolution.
- **Covariant Return Types:** Overriding methods can return a subtype, but overloading is based on parameter lists, not return types.

These advanced techniques further extend the flexibility and power of method overloading in Java.