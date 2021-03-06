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
    }

    // Some abstract methods that is common behavior for all shapes
    abstract void printInformation();

    abstract int computeArea();

    abstract int computePerimeter();// Perimeter and circumference is the same thing

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