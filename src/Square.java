import java.util.Arrays;

public class Square extends Shape {
    int[] sides= new int[4];
    String[] axisNames = {"top left corner X", "top left corner y", "top right corner x", "top right corner y",
            "bottom left corner x", "bottom left corner y", "bottom right corner x", "bottom right corner y"};
    int[] axisPositions = new int[8];


    public Square(String type, int length, int xPosition, int yPosition) {
        super(type, length, xPosition, yPosition);
        Arrays.fill(sides, this.length);

        this.xPosition=xPosition;
        this.yPosition=yPosition;

        // This section places the corners of the square on the correct x and y axis depending on the length of the sides.
        // TOP LEFT CORNER
        axisPositions[0]=xPosition;
        axisPositions[1]=yPosition;

        // TOP RIGHT CORNER
        axisPositions[2]=axisPositions[0]+sides[0];
        axisPositions[3]=axisPositions[1];

        // BOTTOM LEFT CORNER
        axisPositions[4]=axisPositions[0];
        axisPositions[5]=axisPositions[1]-sides[3];

        // BOTTOM RIGHT CORNER
        axisPositions[6]=axisPositions[0]+sides[2];
        axisPositions[7]=axisPositions[3]-sides[1];
    }

    public void printInformation() {
        for (int i=0; i<sides.length; i++) {
            System.out.printf("Side %d is: %dcm\n", (i+1), sides[i]);

        }
        for (int i=0; i<axisNames.length; i++) {
            System.out.printf("%s is at %d\n", axisNames[i], axisPositions[i]);
        }
    }



}
