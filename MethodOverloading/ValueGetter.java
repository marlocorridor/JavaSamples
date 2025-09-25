import java.util.Scanner;

public class ValueGetter {
  // 1 for Integer, 2 for String
  private final int TYPE_INT = 1;
  private final int TYPE_STRING = 2;
  private final int data_type;
  private final int record_count;
  private final Scanner scanner;

  // Constructor
  public ValueGetter(int data_type, int record_count, Scanner scanner) {
    this.data_type = data_type;
    this.record_count = record_count;
    this.scanner = scanner;
  }

  // utility method to print prompt and get values
  private void askForValues() {
    System.out.println("You selected data type: " + (data_type == TYPE_INT ? "Integer" : "String"));
    System.out.println("You will enter " + record_count + " records.");
  }

  // Method to get integer values
  private int[] getIntValues() {
    int[] values = new int[this.record_count];
    this.askForValues();
    for (int i = 0; i < this.record_count; i++) {
      values[i] = this.scanner.nextInt();
    }
    return values;
  }

  // Method to get string values
  private String[] getStringValues() {
    String[] values = new String[this.record_count];
    this.askForValues();
    for (int i = 0; i < this.record_count; i++) {
      values[i] = this.scanner.nextLine();
    }
    return values;
  }

  // Method to get values based on data_type, returns Object for generic handling
  public Object getValues() {
    if (data_type == TYPE_INT) {
      return getIntValues();
    } else if (data_type == TYPE_STRING) {
      return getStringValues();
    }
    return null;
  }

  // getter method for data_type
  public int getDataType() {
    return this.data_type;
  }
}
