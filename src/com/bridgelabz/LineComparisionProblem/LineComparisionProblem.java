package com.bridgelabz.LineComparisionProblem;

import java.util.Scanner;


public class LineComparisionProblem {

    public double lineLength1(int x1, int x2, int y1, int y2) {

        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of Line 1 is :" + length1);
        return length1;

    }

    public double lineLength2(int x3, int x4, int y3, int y4) {
        double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("Length of Line 2 is :" + length2);
        return length2;
    }

    public static double compareto(double lineLength1, double lineLength2) {
        if (lineLength1 > lineLength2) {
            System.out.println("Line 1 is greater than Line 2");
        } else if (lineLength1 < lineLength2) {
            System.out.println("Line 1 is lesser than Line 2");
        } else {
            System.out.println("Both the lines are Equal");
        }
        return lineLength1;

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 and y1");

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("The Values of (x1,y1) :" + x1 + "," + y1);
        System.out.println("Enter x2 and y2");

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println("The Values of (x2,y2) :" + x2 + "," + y2);


        System.out.println("Enter x3 and y3");

        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        System.out.println("The Values of (x3,y3) :" + x3 + "," + y3);
        System.out.println("Enter x4 and y4");

        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();
        System.out.println("The Values of (x4,y4) :" + x4 + "," + y4);

        System.out.println("The Lengths of the line are : ");

        LineComparisionProblem obj = new LineComparisionProblem();

        LineComparisionProblem obj2 = new LineComparisionProblem();


        compareto(obj.lineLength1(x1, x2, y1, y2), obj2.lineLength2(x3, x4, y3, y4));


    }

}
