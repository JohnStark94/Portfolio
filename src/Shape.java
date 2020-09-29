abstract class Shape {
    protected String type;
    protected int length;
    protected int xPosition, yPosition;

    Axis axis = Axis.getAxis();


    public Shape(String type, int length, int xPosition, int yPosition) {
        this.type=type;
        this.length=length;
        this.xPosition = (int) (Math.random() * axis.getxAxis().length);
        this.yPosition = (int) (Math.random() *axis.getyAxis().length);

        //this.xPosition=xPosition;
        //this.yPosition=yPosition;
    }
}


