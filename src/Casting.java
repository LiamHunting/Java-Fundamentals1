

public class Casting {

    public static void castingBasics(String[] args) {

        //casting is the process of converting a value from one data type to another
        //there are two types of casting: implicit and explicit

        //implicit casting (widening): automatically converts a smaller data type to a larger data type generally without loss of data
        short s = 2;
        int i = s + 3; //short is implicitly cast to int before the addition
        System.out.println(i); //output: 5
        
        //explicit casting (narrowing): manually converts a larger data type to a smaller data type which may result in loss of data
        double d = 3.14;
        int j = (int)d + 1; //double is explicitly cast to int, resulting in loss of the decimal part
        System.out.println(j); //output: 4

        //casting between compatible types
        int m = 10;
        double n = m; //int is implicitly cast to double
        System.out.println(n); //output: 10.0
        //explicitly casting back to int
        int o = (int)n; //double is explicitly cast back to int
        System.out.println(o); //output: 10


        //casting between incompatible types
        String str = "123";
        int k = Integer.parseInt(str) + 1; //using Integer.parseInt to convert String to int
        System.out.println(k); //output: 124

        String str2 = "3.14";
        double p = Double.parseDouble(str2) + 1; //using Double.parseDouble to convert String to double
        System.out.println(p); //output: 4.14
        



    }
}
