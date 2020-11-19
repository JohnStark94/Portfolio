public class Dot extends Shape {

    public Dot(String type, int xPos, int yPos) {
        super (type);
        this.center[0] = xPos;
        this.center[1] = yPos;
        computeCenter();
        printInformation();
    }

    @Override
    void printInformation() {
        System.out.println(this.type + ":");
        System.out.println("Center on X-axis is: " + this.center[0]);
        System.out.println("Center on Y-axis is: " + this.center[1]);
    }

    @Override
    int computeArea() {
        return 0;
    }

    @Override
    int computePerimeter() {
        return 0;
    }

    @Override
    void computeCenter() {
        //this.center[0] = (int) (Math.random() * axis.getxAxis().length);
        //this.center[1] = (int) (Math.random() * axis.getyAxis().length);
    }

    boolean isInside(Shape other) {
        if (other.type.equals("Square")) {
            if (this.center[0] > other.xPosition && this.center[0] < other.xPosition + other.length) {
                if (this.center[1] < other.yPosition && this.center[1] > other.yPosition - other.length) {
                    return true;
                }
            }
        }

        if (other.type.equals("Circle")) {
            if (this.center[0] > other.center[0]-other.radius && this.center[0] < other.center[0]+other.radius) {
                if (this.center[1] > other.center[1]-other.radius && this.center[1] < other.center[1]+other.radius) {
                    System.out.println(other.center[0] + "  :  " + other.center[1] + "  :  " + other.radius);
                    return true;
                }
            }

        }
        return false;
    }
}