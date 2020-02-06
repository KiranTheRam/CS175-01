import java.util.Scanner;

public class CarCostCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        All inputs
        System.out.print("Enter cost of a regular car: ");
        double costOfCar = scan.nextDouble();

        System.out.print("Enter miles per gallon of regular car: ");
        double milesInReg = scan.nextDouble();

        System.out.print("Enter cost of hybrid car: ");
        double costOfHybrid = scan.nextDouble();

        System.out.print("Enter miles per gallon of hybrid car: ");
        double milesInHybrid = scan.nextDouble();

        System.out.print("Enter miles traveled in a year: ");
        double milesInAYear = scan.nextDouble();

        System.out.print("Enter cost per gallon of gas: ");
        double costPerGallon = scan.nextDouble();

//        Cost of gas for Reg each year
        double gasMoneyReg = (costPerGallon*(milesInAYear / milesInReg));

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
        double gasMoneyHybrid = (costPerGallon*(milesInAYear / milesInHybrid));

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

        System.out.println("Cost to own after year 1 for regular car: $" + year1Reg + " for hybrid car: $" + year1Hybrid);
        System.out.println("Cost to own after year 2 for regular car: $" + year2Reg + " for hybrid car: $" + year2Hybrid);
        System.out.println("Cost to own after year 3 for regular car: $" + year3Reg + " for hybrid car: $" + year3Hybrid);
        System.out.println("Cost to own after year 4 for regular car: $" + year4Reg + " for hybrid car: $" + year4Hybrid);
        System.out.println("Cost to own after year 5 for regular car: $" + year5Reg + " for hybrid car: $" + year5Hybrid);

//        -------------------------------------------------------------------------------------------------------------

        if (year5Hybrid < year5Reg) {
            System.out.println("The hybrid car pays back after 5 years");
        }
        else {
            System.out.println("The hybrid car doesn't pay back in 5 years");
        }
        }
    }
