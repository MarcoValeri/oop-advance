public class Cylinder extends Solid {

    public Cylinder(double radius, double height) {
        super(radius, height);
    }

    public double volume() {
        double output = super.getPI() * Math.pow(super.getRadius(), 2) * super.getHeight();
        return output;
    }

    public double surface() {
        double output = 6 * super.getPI() * Math.pow(super.getRadius(), 2);
        return output;
    }

}