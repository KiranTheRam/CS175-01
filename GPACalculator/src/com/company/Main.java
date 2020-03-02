package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Initialize variables so they aren't stuck in the loop
        double TotalCreditHours =0;
        double TotalGradePoints=0;
        double LGValue = 0;

//        Print-outs
        System.out.println("Course          Credit Hours          Grade          Grade Points");



        for(int i=1; i<100; i++) {
            System.out.println("Enter course information separated by commas (title, credit hours, letter grade) or type Q to quit:");
            String CourseInfo = scan.nextLine();
            if (CourseInfo.equals("Q")) {
//                System.out.println("Exiting...");
                break;
            }
            else {
                    String[] CourseInfoArr = CourseInfo.split(",", 3);
                    String CourseTitle = CourseInfoArr[0];
                    String CreditHoursString = CourseInfoArr[1];
                    String LetterGrade = CourseInfoArr[2];
                    int CreditHours = Integer.parseInt(CreditHoursString);

    //                    Assigning the values of letter grades
                    if (LetterGrade.equals("A")){
                        LGValue = 4;
                    }
                    else if (LetterGrade.equals("A-")) {
                        LGValue = 3.7;
                    }
                    else if (LetterGrade.equals("B+")) {
                        LGValue = 3.33;
                    }
                    else if (LetterGrade.equals("B")) {
                        LGValue = 3;
                    }
                    else if (LetterGrade.equals("B-")) {
                        LGValue = 2.7;
                    }
                    else if (LetterGrade.equals("C+")) {
                        LGValue = 2.3;
                    }
                    else if (LetterGrade.equals("C")) {
                        LGValue = 2;
                    }
                    else if (LetterGrade.equals("C-")) {
                        LGValue = 1.7;
                    }
                    else if (LetterGrade.equals("D+")) {
                        LGValue = 1.3;
                    }
                    else if (LetterGrade.equals("D")) {
                        LGValue = 1;
                    }
                    else if (LetterGrade.equals("D-")) {
                        LGValue = .7;
                    }
                    else if (LetterGrade.equals("WF") || LetterGrade.equals("F")) {
                        LGValue = 0;
                    }

                    double GradePoints = LGValue * CreditHours;

//                    Time to print w/ formatting
                System.out.printf(CourseTitle+ "%15s %17s %20s" ,CreditHours,LetterGrade, GradePoints);
                System.out.println();

                    TotalCreditHours = TotalCreditHours + CreditHours;
                    TotalGradePoints = TotalGradePoints + GradePoints;
//

//                System.out.println(CourseTitle+ " "+ CreditHours + " " + LetterGrade);
            }

        }
//        Stuff to print after exiting
        System.out.println("\n" + TotalCreditHours+ " Credit Hours Attempted");
        System.out.println(TotalGradePoints+ " Total Grade Points");
        System.out.println("GPA = " + TotalGradePoints+"/"+TotalCreditHours+ " = "+ (TotalGradePoints/TotalCreditHours));

    }
}