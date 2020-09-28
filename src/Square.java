import java.util.Arrays;

public class Square extends Shape {
    int[] sides= new int[4];
    int[] xAxis = new int[100];
    int[] yAxis = new int [100];

    public Square(String type, int length) {
        super(type, length);
        for (int i=0; i<xAxis.length; i++) {
            xAxis[i]=i;
            yAxis[i]=i;
        }
        Arrays.fill(sides, this.length);
    }

    public void printLengths() {
        for (int side : sides) {
            System.out.println(side);
        }
    }


}
