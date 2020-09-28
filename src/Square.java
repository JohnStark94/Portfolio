import java.util.Arrays;

public class Square extends Shape {
    int[] sides= new int[4];


    public Square(String type, int length, int xPosition, int yPosition) {
        super(type, length, xPosition, yPosition);
        Arrays.fill(sides, this.length);
        this.xPosition=40;
        this.yPosition=50;
    }

    public void printInformation() {
        for (int i=0; i<sides.length; i++) {
            System.out.printf("Side %d is: %dcm ", (i+1), sides[i]);
            System.out.println("and is located at: " + xAxis[xPosition] + " on the X-axis and: " + yAxis[yPosition] + " on the Y-axis.");
        }
    }


}
