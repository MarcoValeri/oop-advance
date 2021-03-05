public class Sphere extends Solid {

    public Sphere(double radius) {
        super(radius);
    }

    public double volume() {
        double output = 3 / 4 * super.getPI() * Math.pow(super.getRadius(), 3);
        return output;
    }

    public double surface() {
        double output = 4 * super.getPI() * Math.pow(super.getRadius(), 2);
        return output;
    }

}