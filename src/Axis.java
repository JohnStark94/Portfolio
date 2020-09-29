public class Axis {

    // This will create a coordinate system using the Singleton method. It will only create a single object
    private int[] xAxis = new int[100];
    private int[] yAxis = new int [100];

    private static Axis axis_instance = null;

    private Axis() {
        for (int i=0; i<xAxis.length; i++) {
            xAxis[i]=i;
            yAxis[i]=i;
        }
        System.out.println("A coordinate system has been created. The X- and Y-axes have values of 0-99");
    }

    public static Axis getAxis() {
        if (axis_instance==null) {
            axis_instance = new Axis();
        }
        return axis_instance;
    }

    public int[] getxAxis() {
        return xAxis;
    }

    public int[] getyAxis() {
        return yAxis;
    }
}
