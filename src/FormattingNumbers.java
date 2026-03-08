
import java.text.NumberFormat;

public class FormattingNumbers {
    
    public static void formattingNumbers(String[] args)  {

        //You can format numbers in Java using the NumberFormat class, which is part of the java.text package. This class provides methods for formatting numbers as currency, percentages, and more.

        // To format a number as currency, you can use the getCurrencyInstance() method of the NumberFormat class. This method returns a NumberFormat object that is configured to format numbers as currency according to the default locale.
        
        NumberFormat currency = NumberFormat.getCurrencyInstance(); //NumberFormat is an abstract class, so you cannot create an instance of it directly. Instead, you can use one of its static factory methods, such as getCurrencyInstance(), to get an instance of a concrete subclass that is configured to format numbers in a specific way.
        String result = currency.format(123456.789); // $123,456.79
        System.out.println(result); // $123,456.79

        // To format a number as a percentage, you can use the getPercentInstance() method of the NumberFormat class. This method returns a NumberFormat object that is configured to format numbers as percentages according to the default locale.
        String result2 = NumberFormat.getPercentInstance().format(0.75); // 75%
        System.out.println(result2); // 75%

        // To format a number with a specific number of decimal places, you can use the getNumberInstance() method of the NumberFormat class to get a NumberFormat object that is configured to format numbers according to the default locale, and then use the setMaximumFractionDigits() method to specify the maximum number of decimal places.
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(2);
        String result3 = number.format(123456.789); // 123,456.79
        System.out.println(result3); // 123,456.79





    }
}