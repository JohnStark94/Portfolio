import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Square square = new Square("Square", 6);
        Square square2 = new Square("Square", 10);
        Axis axis = Axis.getAxis();
        square.printInformation();
        square2.printInformation();

        square.distance(square2);
        System.out.println(square.formatDistance());

    }
}