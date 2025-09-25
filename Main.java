import java.util.Scanner;

public class Main {

  // Utility method to exit program with a message
  public static void exitProgram(String message) {
    System.out.println(message);
    System.out.println("Exiting program.");
    System.exit(0);
  }

  public static void main(String[] args) {
    System.out.println("Laboratory #2 - Method Overloading");
    try (Scanner scanner = new Scanner(System.in)) {
      // Let user input number of records
      System.out.print("Enter number of records: ");
      int record_count = scanner.nextInt();

      // if record_count is less than or equal to 0, exit program
      if (record_count <= 0) {
        exitProgram("Record count must be greater than 0.");
      }

      // Let user input data type
      System.out.print("Enter data type (1 for int, 2 for String): ");
      int data_type = scanner.nextInt();
      scanner.nextLine(); // Consume newline left-over

      // if data_type not in array of [1, 2], exit program
      if (data_type != 1 && data_type != 2) {
        exitProgram("Invalid data type selected.");
      }

      // Class that handles getting values
      ValueGetter value_getter = new ValueGetter(data_type, record_count, scanner);
      // Class that handles sorting and printing values
      ValueSorter value_sorter = new ValueSorter(value_getter.getDataType()); // To be accessible outside switch case

      // get value using value_getter method getValues()
      // and `cast generic object` to specific type using `pattern matching`
      switch (value_getter.getValues()) {
        // matches array of int, assign value to int_values variable
        case int[] int_values ->
          // initialize value_sorter with int_values
          value_sorter.setValues(int_values);

        // matches array of String, assign value to string_values variable
        case String[] string_values ->
          // initialize value_sorter with string_values
          value_sorter.setValues(string_values);

        // unknown type, exit program
        default -> {
          exitProgram("Failed to process values of unknown type.");
          return;
        }
      }

      // Sort and print values
      value_sorter.sort();
      value_sorter.printValues();

    } catch (Exception e) {
      // prepare message if not null, use message of class if null
      String message = e.getMessage() != null ? e.getMessage() : e.getClass().getName();

      // Exit program with error message
      exitProgram("An unexpected error occurred: " + message);
    }
  }
}
