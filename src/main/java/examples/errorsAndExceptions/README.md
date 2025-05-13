
# Java Errors and Exceptions

Errors and exceptions are mechanisms in Java to handle unexpected situations during program execution. Understanding their differences and handling them effectively is crucial for writing robust code.

---

## **1. Errors vs. Exceptions**

### **Errors**
- Represent serious issues in the Java Virtual Machine (JVM) that are typically beyond the application's control.
- Subclasses of the `Error` class.
- Examples:
  - `OutOfMemoryError`: JVM runs out of memory.
  - `StackOverflowError`: Call stack exceeds its limit due to deep or infinite recursion.

### **Exceptions**
- Represent conditions that applications can catch and handle.
- Subclasses of the `Exception` class.
- Categories:
  - **Checked Exceptions**: Must be handled at compile time.
  - **Unchecked Exceptions**: Optional to handle.

---

## **2. Handled vs. Unhandled Exceptions**

### **Handled Exceptions**
- Anticipated and managed using mechanisms like `try-catch` blocks.
- Example:
  ```java
  try {
      int result = 10 / 0; // Throws ArithmeticException
  } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero.");
  }
  ```

### **Unhandled Exceptions**
- Occur during execution but are not caught, causing abrupt program termination.
- Example:
  ```java
  int result = 10 / 0; // Throws ArithmeticException and crashes the program
  ```

---

## **3. Common Errors**

### **StackOverflowError**
- Occurs due to deep or infinite recursion.
- Example:
  ```java
  public class Main {
      public static void main(String[] args) {
          recursiveMethod();
      }

      public static void recursiveMethod() {
          recursiveMethod(); // Infinite recursion
      }
  }
  ```

### **OutOfMemoryError**
- Occurs when JVM cannot allocate more memory.
- Example:
  ```java
  import java.util.ArrayList;
  import java.util.List;

  public class Main {
      public static void main(String[] args) {
          List<int[]> list = new ArrayList<>();
          while (true) {
              list.add(new int[1_000_000]); // Consumes memory
          }
      }
  }
  ```

---

## **4. Exceptions You Should Handle**

### **Checked Exceptions**
- Must be handled by the compiler.
- Examples:
  - `IOException`: Input/output operations.
  - `SQLException`: Database access errors.
  - `FileNotFoundException`: File not found.

Example:
```java
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            System.out.println(reader.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An I/O error occurred.");
        }
    }
}
```

### **Unchecked Exceptions**
- Not enforced by the compiler.
- Examples:
  - `NullPointerException`: Accessing a null reference.
  - `IndexOutOfBoundsException`: Invalid index in a list or array.
  - `ArithmeticException`: Arithmetic errors (e.g., division by zero).

Example:
```java
public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Invalid index
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
        }
    }
}
```

---

## **5. Custom Business Exceptions**

### **Inherit from `RuntimeException`**
- For unchecked exceptions.
- Example:
  ```java
  public class BusinessRuntimeException extends RuntimeException {
      public BusinessRuntimeException(String message) {
          super(message);
      }
  }
  ```

### **Inherit from `Exception`**
- For checked exceptions.
- Example:
  ```java
  public class BusinessException extends Exception {
      public BusinessException(String message) {
          super(message);
      }
  }
  ```

---

## **6. Best Practices**
- Handle only recoverable or expected exceptions.
- Avoid catching `Error` subclasses like `OutOfMemoryError` or `StackOverflowError`.
- Use `RuntimeException` for most custom exceptions unless compile-time enforcement is required.

