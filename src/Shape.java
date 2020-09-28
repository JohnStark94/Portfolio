abstract class Shape {
    protected String type;
    protected int length;
    protected int xPosition, yPosition;
    int[] xAxis = new int[100];
    int[] yAxis = new int [100];

    public Shape(String type, int length, int xPosition, int yPosition) {
        this.type=type;
        this.length=length;
        this.xPosition=xPosition;
        this.yPosition=yPosition;

        //creates an axis to set the shapes position. should maybe not be here
        for (int i=0; i<xAxis.length; i++) {
            xAxis[i]=i;
            yAxis[i]=i;
        }
    }
}


