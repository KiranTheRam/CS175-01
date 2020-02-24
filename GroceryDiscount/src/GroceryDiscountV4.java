import java.util.Scanner;

public class GroceryDiscountV4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double amountOff = 0;
            System.out.println("Please enter the cost of your groceries. To end enter 0 or a non-number: ");

            while (scan.hasNextDouble()) {
                double grocCost = scan.nextDouble();
                if (grocCost >= 10 && grocCost <= 1000) {
                    if (grocCost >= 10 && grocCost <= 60) {
                        amountOff = 0.08 * grocCost;
                        System.out.printf("You win a discount coupon of $%.2f (8 percent of your purchase)" , amountOff);
                        System.out.println();
                        System.out.println("-------------------------------------------");
                        System.out.println("Enter another amount to see discount or 0 to end");
                    } else if (grocCost > 60 && grocCost <= 150) {
                        amountOff = 0.1 * grocCost;
                        System.out.printf("You win a discount coupon of $%.2f (10 percent of your purchase)" , amountOff);
                        System.out.println();
                        System.out.println("-------------------------------------------");
                        System.out.println("Enter another amount to see discount or 0 to end");
                    } else if (grocCost > 150 && grocCost <= 210) {
                        amountOff = 0.12 * grocCost;
                        System.out.printf("You win a discount coupon of $%.2f (12 percent of your purchase)" , amountOff);
                        System.out.println();
                        System.out.println("-------------------------------------------");
                        System.out.println("Enter another amount to see discount or 0 to end");
                    } else if (grocCost > 210) {
                        amountOff = 0.14 * grocCost;
                        System.out.printf("You win a discount coupon of $%.2f (14 percent of your purchase)" , amountOff);
                        System.out.println();
                        System.out.println("-------------------------------------------");
                        System.out.println("Enter another amount to see discount or 0 to end");
                    }
                } else if (grocCost == 0) {
                    System.out.println("Ending...");
                    break;
                } else {
                    System.out.println("The amount entered is not between 10 and 1000");
                }

            }
            System.out.println("Exited. If you wish to try again rerun program");

    }
    }
