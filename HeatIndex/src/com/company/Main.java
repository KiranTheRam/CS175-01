package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Printing Temp
        System.out.println("Relative Humidity (%) ∨        Temperature (F) >");
        System.out.printf("     ");
        for (int T = 80; T<=110;T+=2) {
            System.out.printf("%5d",T);
        }
        System.out.println();
        System.out.println("_______________________________________________________");

//        Printing chart

        for (int RH = 40; RH <= 100; RH+=5) {
            System.out.printf("%2d | ",RH);
            for (int T = 80; T<=110;T+=2)
            {
                int HI = (int) Math.round(-42.379 + 2.04901523*T + 10.14333127*RH - .22475541*T*RH -
                        .00683783*T*T - .05481717*RH*RH + .00122874*T*T*RH + .00085282*T*RH*RH - .00000199*T*T*RH*RH);

                if (HI <=137) {
                    if (RH == 95 && T == 92){
//                        Print nothing
                    }
                    else {
                        System.out.printf("%5d", HI);
                    }
                }
            }
            System.out.println();
        }


//        Step 2
        while(true) {
            System.out.print("Please enter a temperature or 0 to end: ");
            int InputTemp = scan.nextInt();
            System.out.println();

            System.out.print("Please enter a humidity: ");
            int InputHumid = scan.nextInt();
            System.out.println();

            double THI = -42.379 + 2.04901523*InputTemp + 10.14333127*InputHumid - .22475541*InputTemp*InputHumid - .00683783*InputTemp*InputTemp - .05481717*InputHumid*InputHumid + .00122874*InputTemp*InputTemp*InputHumid + .00085282*InputTemp*InputHumid*InputHumid - .00000199*InputTemp*InputTemp*InputHumid*InputHumid;
            if (InputTemp == 0) {
                break;
            } else {
                if (THI<90) {
                    System.out.println("Caution");
                }
                else if (THI <105) {
                    System.out.println("Extreme Caution");
                }
                else if (THI <126) {
                    System.out.println("Extreme Caution");
                }
                else {
                    System.out.println("Extreme Caution");
                }
            }
        } // Ending while loop

    }
}