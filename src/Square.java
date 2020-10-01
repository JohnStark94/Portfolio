import java.util.Arrays;

public class Square extends Shape {
    int[] sides= new int[4];

    // An array of strings that can be match to the position of all the corners
    /*String[] axisNames = {"top left corner X", "top left corner y", "top right corner x", "top right corner y",
            "bottom left corner x", "bottom left corner y", "bottom right corner x", "bottom right corner y"};*/
    int[] axisPositions = new int[8];


    public Square(String type) {
        super(type);

        //Creates a random length for the square's sides
        this.length = (int) (Math.random() * 15) + 1;

        Arrays.fill(sides, this.length);

        computeCorners();
        computeCenter();
        computeArea();
        computePerimeter();
        printInformation();
    }

    public void printInformation() {
        System.out.println(type + ":");

        // Will print the exact position of all the corners but is irrelevant to print
        /*for (int i=0; i<axisNames.length; i++) {
            System.out.printf("%s is at %d", axisNames[i], axisPositions[i]);
            if (i%2==1) {
                System.out.print("\n");
            } else {
                System.out.print("  |  ");
            }
        }*/


        System.out.println("Center on X-axis: " + this.center[0]);
        System.out.println("Center on Y-axis: " + this.center[1]);
        for (int i=0; i<sides.length; i++) {
            System.out.printf("Side %d: %dcm\n", (i+1), sides[i]);

        }
        System.out.println("Area: " + this.area + "cm^2");
        System.out.println("Perimeter: " + this.perimeter + "cm");
        System.out.println();
    }

    @Override
    int computeArea() {
        area=length*length;
        return area;
    }

    @Override
    int computePerimeter() {
        perimeter = length*4;
        return perimeter;
    }

    @Override
    void computeCenter() {
        this.center[0] = this.xPosition + (length/2);
        this.center[1] = this.yPosition - (length/2);
    }

    void computeCorners() {
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
}
