import java.util.Arrays;

abstract class Shape {
    protected String type;
    protected int length;
    protected int xPosition, yPosition;
    protected int areal;
    protected int radius;
    protected int[] center = new int[2];
    protected int[] distance = new int[2];

    Axis axis = Axis.getAxis();


    public Shape(String type) {
        this.type=type;
        this.length= (int) (Math.random() * 15) + 1;
        this.xPosition = (int) (Math.random() * axis.getxAxis().length);
        this.yPosition = (int) (Math.random() *axis.getyAxis().length);
        this.center[0] = this.xPosition + (length/2);
        this.center[1] = this.yPosition - (length/2);
    }

    abstract void printInformation();

    /*public Shape(String type, int radius) {
        this.type=type;
        this.center[0]= (int) (Math.random() * axis.getyAxis().length);
        this.center[1]= (int) Math.random() * axis.getxAxis().length;
    }*/

    public int[] distance (Shape other) {
        for (int i=0; i<distance.length; i++) {
            distance[i]=this.center[i]-=other.center[i];
            if (distance[i]<0) {
                distance[i]=distance[i]*-1;
            }
        }
        return distance;
    }

    public String formatDistance() {
        return "The distance between the center of the two shapes are " + distance[0] + " on the X-axis and " + distance[1] + " on the Y-axis";
    }
}


