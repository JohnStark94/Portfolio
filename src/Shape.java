abstract class Shape {
    protected String type;
    protected int perimeter;
    protected int length;
    protected int xPosition, yPosition;
    protected int area;
    protected int radius;
    protected int[] center = new int[2];
    protected int[] distance = new int[2];

    Axis axis = Axis.getAxis();


    public Shape(String type) {
        this.type=type;

        this.xPosition = (int) (Math.random() * axis.getxAxis().length);
        this.yPosition = (int) (Math.random() *axis.getyAxis().length);


    }

    public Shape() {
        this.type="Point";
        for (int i=0; i<center.length; i++) {
            this.center[i] = (int) (Math.random() * axis.getxAxis().length);
        }
    }

    // Some abstract methods that is common behavior for all shapes

    abstract void printInformation();

    abstract int computeArea();

    // Perimeter and circumference is the same thing
    abstract int computePerimeter();

    abstract void computeCenter();


    public void distance (Shape other) {
        for (int i=0; i<distance.length; i++) {
            distance[i]=this.center[i]-=other.center[i];
            if (distance[i]<0) {
                distance[i]=distance[i]*-1;
            }
        }
        System.out.println("The distance between *" + this.type + "* and *" + other.type +
                "* is:\n" + distance[0] + " on the X-axis\n" + distance[1] + " on the Y-axis");
    }
}