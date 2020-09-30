public class Dot extends Shape {

    public Dot() {
        this.type="Point";

        this.center[0] = (int) (Math.random() * axis.getxAxis().length);
        this.center[1] = (int) (Math.random() * axis.getyAxis().length);
        printInformation();
    }

    @Override
    void printInformation() {
        System.out.println(this.type + ":");
        System.out.println("X is: " + this.center[0]);
        System.out.println("Y is: " + this.center[1]);

    }

    @Override
    int computeArea() {
        return 0;
    }

    boolean isInside(Shape other) {
        if (other.type.equals("Square")) {
            if (this.center[0] > other.xPosition && this.center[0] < other.xPosition+other.length) {
                if (this.center[1] < other.yPosition && this.center[1] > other.yPosition-other.length) {
                    return true;
                }
            }
            /*
            if (this.center[0] == other.center[0] + (other.length/2)
                || this.center[0] == other.center[0] - (other.length/2)) {
                if (this.center[1] == other.center[1] + (other.length / 2)
                        || this.center[1] == other.center[1] + (other.length / 2)) {
                    return true;
                }
            }*/
        }

        if (other.type.equals("Circle")) {

        }
        return false;
    }


}
