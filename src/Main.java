public class Main {
    public static void main(String[] args) {
        Square square = new Square("Square");
        Circle circle = new Circle("Circle");
        Dot point = new Dot();


        // Creates a new point if the point is not inside a square
        while (!point.isInside(circle)) {
            point = new Dot();
            System.out.println(point.isInside(circle));
        }

        square.distance(circle);

    }


}