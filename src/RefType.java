

//importing Date class from java.util package
import java.util.Date;

public class RefType {
    
    public static void refType(String[] args) {
        
        //Primitive data type
        byte age = 30;
        System.out.println(age);

        //Declaring reference data type variable
        //"Now" we are creating object of Date class
        //"new" keyword is used to create object in heap memory
        Date now = new Date();
        System.out.println(now);


    }

}
