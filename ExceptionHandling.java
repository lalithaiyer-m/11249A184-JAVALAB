class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {

        // Pre-defined Exception Handling
        try {
            int a = 10;
            int b = 0;
            int result = a / b;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Pre-defined Exception: Cannot divide by zero.");
        }

        // User-defined Exception Handling
        try {
            int age = 16;

            if (age < 18) {
                throw new MyException("Age must be 18 or above.");
            }

            System.out.println("Eligible.");
        }
        catch (MyException e) {
            System.out.println("User-defined Exception: " + e.getMessage());
        }

        System.out.println("Program completed successfully.");
    }
}