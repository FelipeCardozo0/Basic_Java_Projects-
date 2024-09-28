import java.util.Scanner;

public class area_of_triangle {
    public static void main(String[] args) {

        String answer = "";
        Scanner input = new Scanner(System.in);
        double pi = Math.PI;




        while (!answer.equalsIgnoreCase("Triangle") && (!answer.equalsIgnoreCase("Circumference")) && (!answer.equalsIgnoreCase("pyramid")) && (!answer.equalsIgnoreCase("Cone"))){
            System.out.print("What shape are you thinking about, cone, triangle, circumference or pyramid?");
            answer= input.nextLine();
// Triangle
            if (answer.equalsIgnoreCase("Triangle")){
                System.out.print("How long is the 1st side of the triangle: ");
                double triangle_side1 = Double.parseDouble(input.nextLine());
                System.out.print("How long is the 2nd side of the triangle: ");
                double triangle_side2 = Double.parseDouble(input.nextLine());
                System.out.print("How long is the 3rd side of the triangle: ");
                double triangle_side3 = Double.parseDouble(input.nextLine());

                double semi_perimeter = ((triangle_side2) + (triangle_side3) + (triangle_side1))/2;
                double area_triangle = Math.sqrt((semi_perimeter * (semi_perimeter - triangle_side2)* (semi_perimeter - triangle_side1)* (semi_perimeter - triangle_side3)));
                System.out.print("The area of the triangle is:"+ area_triangle);
            }


// CONE
            if (answer.equalsIgnoreCase("Cone")){
                System.out.print("How long is the radius of the base: ");
                double cone_radius = Double.parseDouble(input.nextLine());
                System.out.print("How long is the height:");
                double cone_height = Double.parseDouble(input.nextLine());

                double cone_area = (Math.PI * cone_radius*(cone_height + cone_radius));
                System.out.print("The area of the cone is:"+ cone_area);
            }

// Circumference
            if (answer.equalsIgnoreCase("Circumference")){
                System.out.print("What's the radius of your circumference: ");
            }


        }
        input.close();



    }
}

