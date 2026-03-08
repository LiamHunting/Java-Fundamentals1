
import java.util.Scanner;

public class ReadingInput {

    public static void readingInput(String[] args)  {

        // To read input from the user in Java, you can use the Scanner class, which is part of the java.util package. This class provides methods for reading different types of input, such as strings, integers, and doubles.

        // To use the Scanner class, you first need to create an instance of it and pass an InputStream object to its constructor. The most common InputStream object to use is System.in, which represents the standard input stream (usually the keyboard).
        Scanner scanner = new Scanner(System.in);

        // Once you have a Scanner object, you can use its methods to read input from the user. For example, to read a string input, you can use the nextLine() method:
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim(); // trim() is used to remove any leading or trailing whitespace from the input string.
        System.out.println("Hello, " + name + "!");

        // To read an integer input, you can use the nextInt() method:
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        // To read a double input, you can use the nextDouble() method:
        System.out.print("Enter your height in feet: ");
        double height = scanner.nextDouble();
        System.out.println("Your height is " + height + " feet.");

        // It's important to note that when you use nextInt() or nextDouble(), it does not consume the newline character that is left in the input stream after the user presses Enter. This can cause issues if you try to read a string input immediately after reading an integer or a double. To avoid this issue, you can call nextLine() after reading an integer or a double to consume the leftover newline character.
        scanner.nextLine(); // consume the leftover newline character



    }

}