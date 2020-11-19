public class Main {

    public static void main(String[] args) {
        // Instantiates an object of our different shapes
        Square square = new Square("Square", 5,20,20);
        Circle circle = new Circle("Circle", 20,20,20);
        Dot point = new Dot("Dot",25,25);

        // Creates a new point if the point is not inside a square
        // Activate if you like
        /*while (!point.isInside(circle)) {
            point = new Dot();
            System.out.println(point.isInside(circle));
        }*/

        // Prints true if the point is inside the object
        System.out.println("\nThe point is inside the circle: " + point.isInside(circle));
        System.out.println("The point is inside the square: " + point.isInside(square) + "\n");

        //Measures distance from the square to the circle
        square.distance(circle);
    }
}