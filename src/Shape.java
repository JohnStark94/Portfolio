abstract class Shape {
    protected String type;
    protected int length;
    protected int centerPosition;
    protected int topLeftPosition, bottomLeftPosition, topRightPosition, bottomRightPosition;

    public Shape(String type, int length) {
        this.type=type;
        this.length=length;
    }
}


