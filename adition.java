import java.util.Scanner;

public class adition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter nuumber: ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;
        System.out.print("The sum is: " + sum);

        input.nextLine();
        String answer = "";

        while (!answer.equalsIgnoreCase("yes") && (!answer.equalsIgnoreCase("no"))){
            System.out.println("Do you want to * or / the result, yes or no?: ");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("* or /?");
                String answer2 = input.nextLine();

                if (answer2.equalsIgnoreCase("*")) {
                    System.out.println("By how much");
                    double num3 = input.nextDouble();
                    double result = sum * num3;
                    System.out.println(result);
                }


                else if (answer2.equalsIgnoreCase("/")) {
                    System.out.println("By how much");
                    double num4 = input.nextDouble();
                    double result2 = sum / num4;
                    System.out.println(result2);
                }
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("That's okay");
            }
        }
        input.close();
    }
}
