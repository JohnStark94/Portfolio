public class Circle extends Shape {
    public Circle(String type) {
        super(type);
        this.center[0] = (int) (Math.random() * axis.getxAxis().length);
        this.center[1] = (int) (Math.random() * axis.getyAxis().length);
    }

    void printInformation() {

    }
}
