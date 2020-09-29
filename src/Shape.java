abstract class Shape {
    protected String type;
    protected int length;
    protected int xPosition, yPosition;
    protected int areal;

    Axis axis = Axis.getAxis();


    public Shape(String type, int length) {
        this.type=type;
        this.length=length;
        this.xPosition = (int) (Math.random() * axis.getxAxis().length);
        this.yPosition = (int) (Math.random() *axis.getyAxis().length);
    }

    int areal() {


        return areal;
    }
}


