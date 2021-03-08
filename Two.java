import java.util.Scanner;

public class Two {
    
    public static void main(String[] args) {
        
        // Create a while that allows to run the code
        boolean flag = true;
        while (flag) {

            // Show to the user the menu and gets his/her choice
            System.out.println("\nPlease, select a shape:");
            System.out.println("A) Sphere");
            System.out.println("B) Cylinder");
            System.out.println("C) Cone");
            System.out.print("Insert your choice: ");

            Scanner input_choice = new Scanner(System.in);
            String choice = input_choice.next();

            if (choice.toUpperCase().equals("A") || choice.toUpperCase().equals("B") || choice.toUpperCase().equals("C")) {

                // Get radius before to set the new obj with user shape because
                // radius is required in all shapes
                
                
                // Set userShape following the user choice
                if (choice.toUpperCase().equals("A")) {
                    System.out.println("\nYou have selected Sphere");
                    System.out.print("Insert the radius: ");
                    Scanner input_radius = new Scanner(System.in);
                    double radius = input_radius.nextDouble();
                    Sphere userShape = new Sphere(radius);
                    System.out.println("Your radius is: " + radius);
                    System.out.println("Sphere's Volume: " + userShape.volume());
                    System.out.println("Sphere's Surface: " + userShape.surface());
                } else if (choice.toUpperCase().equals("B")) {
                    System.out.println("\nYou have selected Cylinder");
                    System.out.print("Insert the radius: ");
                    Scanner input_radius = new Scanner(System.in);
                    double radius = input_radius.nextDouble();
                    System.out.print("Insert the height: ");
                    Scanner input_height = new Scanner(System.in);
                    double height = input_height.nextDouble();
                    Cylinder userShape = new Cylinder(radius, height);
                    System.out.println("Your radius is: " + radius);
                    System.out.println("Your height is: " + height);
                    System.out.println("Cylinder's Volume: " + userShape.volume());
                    System.out.println("Cylinder's Surface: " + userShape.surface());
                } else if (choice.toUpperCase().equals("C")) {
                    System.out.println("\nYou have selected Cone");
                    System.out.print("Insert the radius: ");
                    Scanner input_radius = new Scanner(System.in);
                    double radius = input_radius.nextDouble();
                    System.out.print("Insert the height: ");
                    Scanner input_height = new Scanner(System.in);
                    double height = input_height.nextDouble();
                    Cone userShape = new Cone(radius, height);
                    System.out.println("Your radius is: " + radius);
                    System.out.println("Your height is: " + height);
                    System.out.println("Cone's Volume: " + userShape.volume());
                    System.out.println("Cone's Surface: " + userShape.surface());
                }

                // Check if the user want to set up another shape or end the game
                boolean second_flag = true;
                while (second_flag) {

                    System.out.println("\nDo you want to select another shape?");
                    System.out.println("Please, answer yes or no");
                    Scanner input_answer = new Scanner(System.in);
                    String answer = input_answer.next();
                    

                    if (!answer.toUpperCase().equals("NO") && !answer.toUpperCase().equals("YES")) {
                        System.out.println("Select just a valid answer");
                    } else if (answer.toUpperCase().equals("NO")) {
                        System.out.println("Thanks to play with Java shapes");
                        System.out.println("The end");
                        second_flag = false;
                        flag = false;
                    } else if (answer.toUpperCase().equals("YES")) {
                        second_flag = false;
                    }

                }
                
            } else {
                System.out.println("Please, select just a valid menu: A, B or C");
            }

        }

    }

}
