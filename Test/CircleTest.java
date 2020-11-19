import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    //create objects to be tested
    Circle circle0 = new Circle("Circle",20,20,20);
    Circle circle1 = new Circle("Circle",25,20,20);
    Circle circle2 = new Circle("Circle",50,20,20);
    Circle circle3 = new Circle("Circle",2,20,20);
    Circle circle4 = new Circle("Circle",100,20,20);

    @Test
    void computeArea () {
        //create int variables that takes the results from the tested method (in this case compute area)
        int result0 = circle0.computeArea ();
        int result1 = circle1.computeArea ();
        int result2 = circle2.computeArea ();
        int result3 = circle3.computeArea ();
        int result4 = circle4.computeArea ();

        //assertEquals compares an expected result with the actual result that the computeArea method has returned
        assertEquals (1200, result0);
        assertEquals (1875, result1);
        assertEquals (7500, result2);
        assertEquals (12, result3);
        assertEquals (30000, result4);
    }

    @Test
    void computePerimeter () {
        int result0 = circle0.computePerimeter ();
        int result1 = circle1.computePerimeter ();
        int result2 = circle2.computePerimeter ();
        int result3 = circle3.computePerimeter ();
        int result4 = circle4.computePerimeter ();

        assertEquals (125, result0);
        assertEquals (157, result1);
        assertEquals (314, result2);
        assertEquals (12, result3);
        assertEquals (628, result4);
    }
}