//Q10. Create a class which have variable pi as constant, r as radius, a as area. Method cal_area () for calculating area and display () for displaying area.

package JOURNAL;

public class Circle {
    public static final double PI = Math.PI;
    private double r;
    private double a;

    public Circle(double radius) {
        this.r = radius;
    }

    public void cal_area() {
        this.a = PI * r * r;
    }

    public void display() {
        System.out.println("Radius: " + r);
        System.out.printf("Area: %.2f", a);
    }

    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.cal_area();
        c.display();
    }
}
