public class Circle extends Shape {
    public Circle(String type) {
        super(type);
        this.center[0] = (int) (Math.random() * axis.getxAxis().length);
        this.center[1] = (int) (Math.random() * axis.getyAxis().length);
        this.radius = (int) (Math.random() * 7) + 1;

        computeArea();
        computePerimeter();
        printInformation();
    }

    @Override
    void printInformation() {
        System.out.println(type + ":");
        System.out.println("Center on X-axis: " + this.center[0]);
        System.out.println("Center on Y-axis: " + this.center[1]);
        System.out.println("radius: " + radius);
        System.out.println("area: " + computeArea());
        System.out.println("perimeter: " + computePerimeter());
        System.out.println();
    }

    @Override
    int computeArea() {
        this.area = (int) Math.PI * (this.radius * this.radius);
        return area;
    }

    int computePerimeter() {
        perimeter = (int) (2 * Math.PI * radius);
        return perimeter;
    }


}
