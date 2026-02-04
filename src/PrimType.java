public class PrimType {
    
    public static void PrimType(String[] args) {
        
    // Decalring and initializing integer variables
        int myAge = 25;
        int anotherAge = myAge;
        System.out.println(myAge);
        System.out.println(anotherAge);
        // Modifying anotherAge
        anotherAge = 30;
        System.out.println(myAge);
        System.out.println(anotherAge);

        // Declaring and initializing byte variables (range: -128 to 127)
        byte myByte = 127;
        byte anotherByte = -128;
        System.out.println(myByte);
        System.out.println(anotherByte);

        // Declaring and initializing short variables (range: -32,768 to 32,767)
        short myShort = 32000;
        short anotherShort = -32000;
        System.out.println(myShort);
        System.out.println(anotherShort);

        // Declaring and initializing long variables (range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        long myLong = 9223372036854775807L;
        long anotherLong = -9223372036854775808L;
        System.out.println(myLong);
        System.out.println(anotherLong);

        // Declaring and initializing floating-point variables (range: approximately ±3.40282347E+38F for float and ±1.79769313486231570E+308 for double)
        float myFloat = 5.75f;
        double myDouble = 19.99d;
        System.out.println(myFloat);
        System.out.println(myDouble);

        // Declaring and initializing character and string variables ('A' single quote for char and "Hello, World!" double quote for String)
        char myChar = 'A';
        String myString = "Hello, World!";
        System.out.println(myChar);
        System.out.println(myString);

        // Declaring and initializing boolean variables (true or false)
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        // Demonstrating type casting
        int myInt = 9;
        double myCastedDouble = myInt; // Implicit casting
        System.out.println(myCastedDouble);
        double anotherDouble = 9.78;
        int myCastedInt = (int) anotherDouble; // Explicit casting
        System.out.println(myCastedInt);
        
    }

}
