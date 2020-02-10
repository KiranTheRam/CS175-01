package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Gathering information about regular car
        System.out.println("Enter information for the regular car:");
        String Carinfo = scan.nextLine();

        String model = Carinfo.substring(0, 14);

        String costOfCarString =  Carinfo.substring(15, 20);
        int costOfCar = Integer.parseInt(costOfCarString);

        String MpGString = Carinfo.substring(21,23);
        int MpG = Integer.parseInt(MpGString);

//        Gathering information about hybrid car
        System.out.println("Enter information for the hybrid car:");
        String HybridCarinfo = scan.nextLine();

        String HybridModel = HybridCarinfo.substring(0, 12);

        String costOfHybridString =  HybridCarinfo.substring(13, 18);
        int costOfHybrid = Integer.parseInt(costOfHybridString);

        String MpGHybridString = HybridCarinfo.substring(19,21);
        int HybridMpG = Integer.parseInt(MpGHybridString);

//        Gathering general information
        System.out.print("Enter miles traveled in a year: ");
        double milesInAYear = scan.nextDouble();

        System.out.print("Enter cost per gallon of gas: ");
        double costPerGallon = scan.nextDouble();

//        Cost of gas for Reg each year
        double gasMoneyReg = (costPerGallon*(milesInAYear / MpG));

//        Calculating the cost of regular car for 1 year
        double year1Reg = costOfCar + gasMoneyReg;

//        Calculating the cost of regular car for 2 year
        double year2Reg = year1Reg + gasMoneyReg;

//        Calculating the cost of regular car for 3 year
        double year3Reg = year2Reg + gasMoneyReg;

//        Calculating the cost of regular car for 4 year
        double year4Reg = year3Reg + gasMoneyReg;

//        Calculating the cost of regular car for 5 year
        double year5Reg = year4Reg + gasMoneyReg;

//        Cost of gas for Reg each year
        double gasMoneyHybrid = (costPerGallon*(milesInAYear / HybridMpG));

//        Calculating the cost of hybrid card for 1 year
        double year1Hybrid = costOfHybrid + gasMoneyHybrid;

//        Calculating the cost of hybrid card for 2 year
        double year2Hybrid = year1Hybrid + gasMoneyHybrid;

//        Calculating the cost of hybrid card for 3 year
        double year3Hybrid = year2Hybrid + gasMoneyHybrid;

//        Calculating the cost of hybrid card for 4 year
        double year4Hybrid = year3Hybrid + gasMoneyHybrid;

//        Calculating the cost of hybrid card for 5 year
        double year5Hybrid = year4Hybrid + gasMoneyHybrid;

//        ------------------------------------------------------------------------------------------------------------

        System.out.println("Cost to own after year 1 for "+ (model) +": $" + year1Reg + " for "+ (HybridModel) +": $" + year1Hybrid);
        System.out.println("Cost to own after year 2 for "+ (model) +": $" + year2Reg + " for "+ (HybridModel) +": $" + year2Hybrid);
        System.out.println("Cost to own after year 3 for "+ (model) +": $" + year3Reg + " for "+ (HybridModel) +": $" + year3Hybrid);
        System.out.println("Cost to own after year 4 for "+ (model) +": $" + year4Reg + " for "+ (HybridModel) +": $" + year4Hybrid);
        System.out.println("Cost to own after year 5 for "+ (model) +": $" + year5Reg + " for "+ (HybridModel) +": $" + year5Hybrid);

//        -------------------------------------------------------------------------------------------------------------

        if (year5Hybrid < year5Reg) {
            System.out.println("The "+(HybridModel)+" pays back after 5 years");
        }
        else {
            System.out.println("The "+(HybridModel)+" doesn't pay back in 5 years");
        }
    }
}

