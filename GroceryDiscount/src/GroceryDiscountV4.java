import java.util.Scanner;

public class GroceryDiscountV4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean keep = true;

            System.out.println("Please enter the cost of your groceries. To end enter 0 or a non-number: ");

            while (scan.hasNextDouble()) {
                double grocCost = scan.nextDouble();
                if (grocCost >= 10 && grocCost <= 1000) {
                    if (grocCost >= 10 && grocCost <= 60) {
                        System.out.println("You win a discount coupon of $" + 0.08 * grocCost + (" (8% of your purchase)"));
                        System.out.println("-------------------------------------------");
                        System.out.println("Enter another amount to see discount or 0 to end");
                    } else if (grocCost > 60 && grocCost <= 150) {
                        System.out.println("You win a discount coupon of $" + 0.1 * grocCost + (" (10% of your purchase)"));
                        System.out.println("-------------------------------------------");
                        System.out.println("Enter another amount to see discount or 0 to end");
                    } else if (grocCost > 150 && grocCost <= 210) {
                        System.out.println("You win a discount coupon of $" + 0.12 * grocCost + (" (12% of your purchase)"));
                        System.out.println("-------------------------------------------");
                        System.out.println("Enter another amount to see discount or 0 to end");
                    } else if (grocCost > 210) {
                        System.out.println("You win a discount coupon of $" + 0.14 * grocCost + (" (14% of your purchase)"));
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
