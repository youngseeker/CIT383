class Circle {
    private double radius;
    public void setRadius(double r) { radius = r; }
    public double getRadius() { return radius; }
    public double calcDiameter() { return 2 * radius; }
    public double calcArea() { return Math.PI * radius * radius; }
}

public class MakeCircle {                  // the driver (executable) class
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(3.0);
        System.out.println("Diameter: " + c.calcDiameter());
        System.out.println("Area: " + c.calcArea());
    }
}