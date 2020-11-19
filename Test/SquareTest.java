import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    //create objects to be tested
    Square square0 = new Square("Square",5,20,20);
    Square square1 = new Square("Square",8,40,40);
    Square square2 = new Square("Square",20,50,50);
    Square square3 = new Square("Square",50,60,60);
    Square square4 = new Square("Square",100,70,70);

    @org.junit.jupiter.api.Test
    void computeArea () {
        //create int variables that takes the results from the tested method (in this case compute area)
        int result0 = square0.computeArea ();
        int result1 = square1.computeArea ();
        int result2 = square2.computeArea ();
        int result3 = square3.computeArea ();
        int result4 = square4.computeArea ();

        //assertEquals compares an expected result with the actual result that the computeArea method has returned
        assertEquals (25, result0);
        assertEquals (64, result1);
        assertEquals (400, result2);
        assertEquals (2500, result3);
        assertEquals (10000, result4);
    }

    @org.junit.jupiter.api.Test
    void computePerimeter () {
        int result0 = square0.computePerimeter ();
        int result1 = square1.computePerimeter ();
        int result2 = square2.computePerimeter ();
        int result3 = square3.computePerimeter ();
        int result4 = square4.computePerimeter ();

        assertEquals(20, result0);
        assertEquals(32, result1);
        assertEquals(80, result2);
        assertEquals(200, result3);
        assertEquals(400, result4);
    }

    @org.junit.jupiter.api.Test
    void computeCorners () {
    }
}

