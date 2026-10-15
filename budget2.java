
import java.util.Scanner;
public class budget2 {


    public static void main(String[] args) {
        double total = 0;
        int gifts = 0;
        String choice = "y";


        Scanner input = new Scanner(System.in);

        System.out.print("This is a budget planner for holiday shopping. Add your budget. -- $");
        double budget = input.nextDouble();
        input.nextLine();

        while (choice.equalsIgnoreCase("y")) {
            System.out.print("What is the gift name? -- ");
            String giftname = input.nextLine();
            System.out.print("What is the gift price? -- $");
            double price = input.nextDouble();
            input.nextLine();

            while (price <= 0) {
                System.out.print("ERROR -- Price is not valid. Enter a price above 0 -- $");
                price = input.nextDouble();
                input.nextLine();
            }
                total = total + price;

                System.out.println(giftname + " Added successfully.");

                if (total > budget) {
                    System.out.println("You're over budget.");
                } else {
                    System.out.println("You're still within your budget.");
                }

            System.out.println("Add another gift? y/n");
            choice = input.nextLine();
        }

            double remaining = budget - total;
            boolean inbudget = total <= budget;

            System.out.println("___________________________________________");
            System.out.println("S h o p p i n g  R e p o r t ");
            System.out.println("___________________________________________");

            System.out.printf("Your budget -- $%.2f%n", budget);
            System.out.printf("How much you spent -- $%.2f%n", total);
            System.out.printf("Money remaining -- $%.2f%n", remaining);

            if (inbudget) {
                System.out.println("You were successfully in your budget.");
            } else {
                System.out.println("You went over your budget.");
            }



        input.close();

    }
}
