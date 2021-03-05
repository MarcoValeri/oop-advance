public class Solid {
    private double radius, height;
    private final double PI = Math.PI;

    // Constructor with one @param radius
    public Solid(double radius) {
        this.radius = radius;
    }

    // Constructor with two @param radius and height
    public Solid(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double getPI() {
        return PI;
    }

    public double volume() {
        return 0;
    }

    public double surface() {
        return 0;
    }
}