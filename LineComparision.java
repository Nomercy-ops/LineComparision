/**
 * 
 * @author Rikesh Chhetri
 * @Created_on: 06.06.21
 * 
 * purpose: Line comparison program to compare length of two lines with co-ordinates.
 * To model a line co-ordinate Cartesian system is used and length is calculated.
 * 
 * 
 */

package com.bridgelabz.lineComparision;

// scanner  class is imported to take user input
import java.util.Scanner;

public class LineComparision {
	
	 // variables
    private static Integer lengthOfLine1 = 0;
    private static Integer lengthOfLine2 = 0;

	public static void main(String[] args) {

		System.out.println("Welcome to line comparison computation");
		
	}
	
	 /**
     * UC-1 to calculate length of two lines getting user coordinates and
     * passing it to method for calculation
     */
    private static void gettingCoordinates() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first co-ordinate of x of line 1");
        int x1 = scanner.nextInt();
        System.out.println("Enter the first co-ordinate of y of line 1");
        int y1 = scanner.nextInt();
        System.out.println("Enter the second co-ordinate of x of line 1");
        int x2 = scanner.nextInt();
        System.out.println("Enter the second co-ordinate of y of line 1");
        int y2 = scanner.nextInt();
        calculateLength1(x1, y1, x2, y2);
        System.out.println("Enter the first co-ordinate of x of line 1");
        int X1 = scanner.nextInt();
        System.out.println("Enter the first co-ordinate of y of line 1");
        int Y1 = scanner.nextInt();
        System.out.println("Enter the second co-ordinate of x of line 1");
        int X2 = scanner.nextInt();
        System.out.println("Enter the second co-ordinate of y of line 1");
        int Y2 = scanner.nextInt();
        calculateLength2(X1, Y1, X2, Y2);
    }

    /**
     * UC-1 to calculating the lengtH of line1 here co-ordinates x1,y1,x2,y2 is
     * passed to get the length
     */
    private static void calculateLength1(int x1, int y1, int x2, int y2) {

        lengthOfLine1 = (int) Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        System.out.println("The length of line 1 is : " + lengthOfLine1);
    }

    /**
     * UC-1 to calculating the length of line2 here co-ordinates X1,Y1,X2,Y2 is
     * passed to get the length
     */
    private static void calculateLength2(int X1, int Y1, int X2, int Y2) {

        lengthOfLine2 = (int) Math.sqrt((Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2)));
        System.out.println("The length of line 2 is : " + lengthOfLine2);
    }
	
	
	 /**
     * UC-2 to check of lines are equal or not using .equals method
     *
     * @param lengthOfLine1
     * @param lengthOfLine2
     */
    private static void checkEqualityOfLine() {

        if (lengthOfLine1.equals(lengthOfLine2)) {
            System.out.println("Both Lengths are equals");
        } else {
            System.out.println(" Lengths are not equals");
        }
    }
	
	
	 /**
     * UC-3 to check the  lines are equal,greater than and less than using .compareTo
     * Here integer compare to method return 0 for equal -1 for less than and 1 for greater than method
     */
    public static void compareTwoLines() {

        switch (lengthOfLine1.compareTo(lengthOfLine2)) {
            case 0:
                System.out.println("Two lines are equal in length");
                break;
            case -1:
                System.out.println("Length Of Line1 is less than Length Of Line 2");
                break;
            default:
                System.out.println("Length Of Line1 is Greater than Length Of Line 2");
                break;
        }
    }
}

	
}

	