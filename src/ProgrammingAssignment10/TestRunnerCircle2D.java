package ProgrammingAssignment10;
/*
Full Name : Lhoucine ET TIHAMI
Objective: The objective of the project is to create a Circle2D class that
 performs operations like calculating area, perimeter, and checking
 point or circle containment and overlap.
 */
public class TestRunnerCircle2D {
        public static void main(String[] args) {
            // Create a Circle2D object c1
            Circle2D c1 = new Circle2D(2, 2, 5.5);
            // Display the area of c1
            System.out.println("Area = " + c1.getArea());
            //Display perimeter of c1
            System.out.println("Perimeter = " + c1.getPerimeter());
            // Test the contains method with point (3, 3)
            System.out.println("Contains point (3, 3): " + c1.contains(3, 3));
            // Test the contains method with another circle (center: 4, 5, radius: 10.5)
            System.out.println("Contains (new Circle2D(4, 5, 10.5)): " +
                    c1.contains(new Circle2D(4, 5, 10.5)));

            // Test the overlaps method with another circle (center: 3, 5, radius: 2.3)
            System.out.println("Overlaps (new Circle2D(3, 5, 2.3)): " +
                    c1.overlaps(new Circle2D(3, 5, 2.3)));
        }
    }




