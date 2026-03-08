import java.util.Arrays;

public class RefTypeArrays{

    public static void ArrLists(String[] args) {
    
        //Integer array declaration (old way)
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        //Printing an array will not print the values but instead will print the address in memory where the array is stored
        System.out.println(numbers);

        //Use Arrays method toString() to 
        System.out.println(Arrays.toString(numbers));

        //Intefer array declaration (new way)
        int[] numbers2 = {1, 3, 6, 0, 0};
        System.out.println(numbers2.length);
        System.out.println(Arrays.toString(numbers2));

        //Arrays method sort()
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));


        //Multi-dimensional arrays

        //2D array declare using [rows][columns] 
        int[][] numbers2D = new int[2][3];
        numbers2D[0][0] = 1;

        //toString method will not work for multi-dimensional arrays and will output the arrays address in memory
        System.out.println(Arrays.toString(numbers2D));

        //To fix this we use the Arrays built in method deepToString()
        System.out.println(Arrays.deepToString(numbers2D));

        //3D arrays
        int[][][] numbers3D = new int[2][3][4];
        numbers3D[0][0][0] = 1;
        numbers3D[0][1][1] = 5;
        numbers3D[1][2][3] = 7;
        
        System.out.println(Arrays.deepToString(numbers3D));

        //Multi-dimensional arrays new way of declaring with curly braces
        int[][] newNumber2D = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(newNumber2D));





    }


}