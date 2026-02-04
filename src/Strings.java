


public class Strings {
    public static void striVar(String[] args) {
        
        // Declaring and initializing string variables
        String greeting = "Hello";
        String name = "Alice";
        System.out.println(greeting);
        System.out.println(name);

        // Concatenating strings
        String message = greeting + ", " + name + "!";
        System.out.println(message);

        // String methods
        int length = message.length();
        System.out.println("Length of message: " + length);

        String upperCaseMessage = message.toUpperCase();
        System.out.println("Uppercase message: " + upperCaseMessage);

        String lowerCaseMessage = message.toLowerCase();
        System.out.println("Lowercase message: " + lowerCaseMessage);

        boolean containsAlice = message.contains("Alice");
        System.out.println("Message contains 'Alice': " + containsAlice);

        String replacedMessage = message.replace("Alice", "Bob");
        System.out.println("Replaced message: " + replacedMessage);
        
        
    }
}