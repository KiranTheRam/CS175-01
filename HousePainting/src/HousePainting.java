import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the painter's rate per square foot ");
        int rate = scan.nextInt();

//      Getting house measurments
        System.out.print("Input the house length ");
        int houseLength = scan.nextInt();

        System.out.print("Input the house width ");
        int houseWidth = scan.nextInt();

        System.out.print("Input the house height ");
        int houseHeight = scan.nextInt();


//      Getting window info
        System.out.print("Input the number of windows ");
        int numOfWindow = scan.nextInt();

        System.out.print("Input the window length ");
        int windowWidth = scan.nextInt();

        System.out.print("Input the window height ");
        int windowHeight = scan.nextInt();


//      Getting door info
        System.out.print("Input the number of doors ");
        int numOfDoor = scan.nextInt();

        System.out.print("Input the door length ");
        int doorLength = scan.nextInt();

        System.out.print("Input the door width ");
        int doorWidth = scan.nextInt();



//      Calculation time
//        Door space to subtract
        int doorSpace=(doorLength*doorWidth)*numOfDoor;

//        Window space to subtract
        int windowSpace = (windowWidth*windowHeight)*numOfWindow;

//        Calculate total area to paint
        int regSideArea = (houseLength*houseWidth);
        double peakSideArea = regSideArea + (.5)*((houseLength*(houseHeight-houseWidth)));





        double totalArea = ((2*regSideArea) + (2*peakSideArea)) - (windowSpace + doorSpace);

//        Calculate price
        double TOTAL = totalArea * rate;

        System.out.println("The area to be painted is " + totalArea + " square feet");
        System.out.println("At a rate of $" + rate + "/hr, your total will be $" + TOTAL);

    }
}
