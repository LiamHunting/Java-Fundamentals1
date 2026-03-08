
public class BasicMath {

    public static void basicMathOperators(String[] args) {

        //Java basic math operators are:
        int answer1 = 10 + 7; //addition: +
        int answer2 = 20 - 9; //subtraction: -
        int answer3 = 10 * 10; //multiplication: *
        int answer4 = 120 / 5; //division: /
        int answer5 = 20 % 7; //modulous(remainder): %

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
        System.out.println(answer5);


        //further look at division
        int answer6 = 10 / 3; //will output a whole number not a decimal/float
        double answer7 = (double) 10 / (double) 3;

        System.out.println(answer6);
        System.out.println(answer7);


        //increment and decrement operators
        int x = 5;
        x++; //increment operator: adds 1 to the variable
        System.out.println(x); //output: 6

        int y = x++; //post-increment: assigns the value of x to y, then increments x
        System.out.println(y); //output: 6
        System.out.println(x); //output: 7

        int z = ++x; //pre-increment: increments x, then assigns the value of x to z
        System.out.println(z); //output: 8
        System.out.println(x); //output: 8


        //compound assignment operators
        int a = 10;
        a += 5; //equivalent to a = a + 5
        System.out.println(a); //output: 15

        a -= 3; //equivalent to a = a - 3
        System.out.println(a); //output: 12

        a *= 2; //equivalent to a = a * 2
        System.out.println(a); //output: 24

        a /= 4; //equivalent to a = a / 4
        System.out.println(a); //output: 6

        
    }

}
