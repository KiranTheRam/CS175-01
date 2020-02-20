package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                System.out.println("Please enter the cost of your groceries: ");
                double grocCost = scan.nextDouble();
                if (grocCost < 10) {
                    System.out.println("You are not eligible for a coupon at this time");
                } else if (grocCost >= 10 && grocCost <= 60) {
                    System.out.println("You win a discount coupon of $" + 0.08 * grocCost + (" (8% of your purchase)"));
                    System.out.println();
                } else if (grocCost > 60 && grocCost <= 150) {
                    System.out.println("You win a discount coupon of $" + 0.1 * grocCost + (" (10% of your purchase)"));
                    System.out.println();
                } else if (grocCost > 150 && grocCost <= 210) {
                    System.out.println("You win a discount coupon of $" + 0.12 * grocCost + (" (12% of your purchase)"));
                    System.out.println();
                } else if (grocCost > 210) {
                    System.out.println("You win a discount coupon of $" + 0.14 * grocCost + (" (14% of your purchase)"));
                    System.out.println();
                }
            }

        }
