

public class ConstantVarType{

    public static void constVarType(String[] args) {

        //Declaring constant variables in Java (good practice is to name const variables all caps)
        final float PI = 3.14F;

        System.out.println(PI);

        //PI = 1.0F; Trying to change PI will result in a compilation error along the lines of "cannot assign value to final variable PI"
        


    }

}