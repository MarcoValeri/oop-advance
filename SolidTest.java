public class SolidTest {
    
    public static void main(String[] args) {

        // Create an instance of Sphere
        Sphere s1 = new Sphere(10);
        System.out.println("Radius: " + s1.getRadius());
        System.out.println("PI: " + s1.getPI());
        System.out.println("Volume: " + s1.volume());
        System.out.println("Surface: " + s1.surface());

        // Create an instance of Cylinder
        Cylinder c1 = new Cylinder(10, 10);
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Height: " + c1.getRadius());
        System.out.println("PI: " + c1.getPI());
        System.out.println("Volume: " + c1.volume());
        System.out.println("Surface: " + c1.surface());

        // Create an instance of Cone
        Cone cone1 = new Cone(10, 10);
        System.out.println("Radius: " + cone1.getRadius());
        System.out.println("Height: " + cone1.getRadius());
        System.out.println("PI: " + cone1.getPI());
        System.out.println("Volume: " + cone1.volume());
        System.out.println("Surface: " + cone1.surface());
    }

}
