public class Circle extends Shape {

    public Circle (String type, int rad, int xPos,int yPos) {
        super (type);
        this.radius = rad;
        this.xPosition = xPos;
        this.yPosition = yPos;

        computeArea ();
        computeCenter ();
        computePerimeter ();
        printInformation ();
    }

    @Override
    void printInformation () {
        System.out.println (type + ":");
        System.out.println ("Center on X-axis: " + this.center[0]);
        System.out.println ("Center on Y-axis: " + this.center[1]);
        System.out.println ("Radius: " + this.radius + "cm");
        System.out.println ("Area: " + this.area + "cm^2");
        System.out.println ("Perimeter: " + this.perimeter + "cm");
        System.out.println ();
    }

    @Override
    int computeArea () {
        this.area = (int) Math.PI * (this.radius * this.radius);
        return area;
    }

    int computePerimeter () {
        perimeter = (int) (2 * Math.PI * radius);
        return perimeter;
    }

    @Override
    void computeCenter () {
        this.center[0] = (int) (Math.random () * axis.getxAxis ().length);
        this.center[1] = (int) (Math.random () * axis.getyAxis ().length);
    }
}
