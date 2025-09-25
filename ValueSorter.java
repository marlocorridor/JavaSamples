import java.util.Arrays;

public class ValueSorter {
  private final int TYPE_INT = 1;
  private final int TYPE_STRING = 2;
  private final int data_type;
  private int[] int_values;
  private String[] string_values;

  // Constructor with only data type
  public ValueSorter(int data_type) {
    this.data_type = data_type;
  }

  // Constructor overloading for int[]
  public ValueSorter(int data_type, int[] int_values) {
    this.data_type = data_type;
    this.int_values = int_values;
  }

  // Constructor overloading for String[]
  public ValueSorter(int data_type, String[] string_values) {
    this.data_type = data_type;
    this.string_values = string_values;
  }

  // Method to sort values
  public void sort() {
    // check if values are set
    if (int_values == null && string_values == null) {
      System.out.println("No values to sort.");
      return;
    }

    // Sort based on data type
    switch (this.data_type) {
      case TYPE_INT -> Arrays.sort(int_values);
      case TYPE_STRING -> Arrays.sort(string_values);
    }
  }

  // Method to print values
  public void printValues() {
    if (int_values != null) {
      System.out.println("Sorted integer values:");
      System.out.println(Arrays.toString(int_values));
    } else if (string_values != null) {
      System.out.println("Sorted string values:");
      System.out.println(Arrays.toString(string_values));
    }
  }

  // Setter for values using overloading
  public void setValues(int[] int_values) {
    this.int_values = int_values;
    this.string_values = null; // Clear string values
  }

  public void setValues(String[] string_values) {
    this.string_values = string_values;
    this.int_values = null; // Clear int values
  }

}
