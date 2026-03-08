

public class TheMathClass {
    
    public static void theMathClass(String[] args)  {

        // Math class is a built in class that has a lot of useful methods for doing math operations. It is a static class, so you don't need to create an instance of it to use its methods. You can just call the methods directly on the class.
        // Math class has a lot of methods for doing math operations, such as:

        // Math.round() takes a double or a float as an argument and returns a long or an int, respectively. It rounds the number to the nearest integer. If the number is exactly halfway between two integers, it rounds up to the nearest integer.
        int result = (int) Math.round(3.5);
        System.out.println(result); // 4
        long result2 = Math.round(3.5);
        System.out.println(result2); // 4

        // Math.ceil() takes a double or a float as an argument and returns a double or a float, respectively. It rounds the number up to the nearest integer.
        int result3 = (int)Math.ceil(3.2f);
        System.out.println(result3); // 4
        int result4 = (int)Math.ceil(6.5d);
        System.out.println(result4); // 7

        // Math.floor() takes a double or a float as an argument and returns a double or a float, respectively. It rounds the number down to the nearest integer.
        int result5 = (int)Math.floor(3.8f);
        System.out.println(result5); // 3
        int result6 = (int)Math.floor(6.3d);
        System.out.println(result6); // 6

        // Math.max() takes two numbers as arguments and returns the larger of the two numbers.
        int result7 = Math.max(3, 5);
        System.out.println(result7); // 5
        double result8 = Math.max(3.5, 2.5);
        System.out.println(result8); // 3.5

        // Math.min() takes two numbers as arguments and returns the smaller of the two numbers.
        int result9 = Math.min(3, 5);
        System.out.println(result9); // 3
        double result10 = Math.min(3.5, 2.5);
        System.out.println(result10); // 2.5

        // Math.pow() takes two numbers as arguments and returns the first number raised to the power of the second number.
        double result11 = Math.pow(2, 3);
        System.out.println(result11); // 8.0
        double result12 = Math.pow(3, 2);
        System.out.println(result12); // 9.0

        // Math.sqrt() takes a number as an argument and returns the square root of that number.
        double result13 = Math.sqrt(16);
        System.out.println(result13); // 4.0
        double result14 = Math.sqrt(25);
        System.out.println(result14); // 5.0

        // Math.random() returns a random number between 0.0 (inclusive) and 1.0 (exclusive).
        double result15 = Math.random();
        System.out.println(result15); // a random number between 0.0 and 1.0

        double result16 = Math.random() * 10; // a random number between 0.0 and 10.0
        System.out.println(result16); // a random number between 0.0 and 10.0

        double result17 = Math.round((Math.random() * 10)); // a random number between 0 and 10, rounded to the nearest integer
        System.out.println(result17); // a random number between 0 and 10, rounded to the nearest integer

        int result18 = (int) (Math.random() * 100); // a random number between 0 and 99
        System.out.println(result18); // a random number between 0 and 99




    }
}