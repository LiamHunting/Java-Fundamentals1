

import java.awt.Point;


public class PrimVSRef {
    public static void primVSRef(String[] args) throws Exception {
     
        // Primitive data type
        int x = 10;
        int y = x; // Copying value of x to y
        System.out.println("Before modifying y:");
        System.out.println("x: " + x); // Outputs 10
        System.out.println("y: " + y); // Outputs 10

        y = 20; // Modifying y
        System.out.println("After modifying y:");
        System.out.println("x: " + x); // Outputs 10 (unchanged)
        System.out.println("y: " + y); // Outputs 20 (changed)

        // Reference data type
        Point point1 = new Point(1, 1);
        Point point2 = point1; // point2 references the same object as point1
        System.out.println("Before modifying point2:");
        System.out.println("point1: " + point1); // Outputs (1, 1)
        System.out.println("point2: " + point2); // Outputs (1, 1)

        point2.x = 5; // Modifying point2
        System.out.println("After modifying point2:");
        System.out.println("point1: " + point1); // Outputs (5, 1) (changed)
        System.out.println("point2: " + point2); // Outputs (5, 1) (changed)
        // Both point1 and point2 reflect the change because they reference the same object in memory

        
    }

}