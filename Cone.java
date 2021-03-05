public class Cone extends Solid {

    public Cone(double radius, double height) {
        super(radius, height);
    }

    public double volume() {
        double output = 1 / 3 * super.getPI() * Math.pow(super.getRadius(), 2) * super.getHeight();
        return output;
    }

    public double surface() {
        double output = (1 + Math.sqrt(5)) * super.getPI() * Math.pow(super.getRadius(), 2);
        return output;
    }

}