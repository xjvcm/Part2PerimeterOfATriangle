/*
    Jonathan Manzano
    
    Assignment: Selection Structures - Part 2: Perimeter of a Triangle

    This program is to calculate the perimeter of a triangle.  The user is
    prompt to input the lenght of each side.  An input validation is 
    implemented to ensure that the lenghts entered equate to a valid 
    triangle.  For this validation, sum of two sides should result in being
    greater than the side that's left over.
*/

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables for triable sides & perimeter
        double sideOne, sideTwo, sideThree, perimeter;

        // Prompt user to input lenght of each side
        System.out.println("Enter lengths of sides of the triangle: ");
        System.out.print("Side 1: ");
        sideOne = input.nextDouble();
        System.out.print("Side 2: ");
        sideTwo = input.nextDouble();
        System.out.print("Side 3: ");
        sideThree = input.nextDouble();

        // Validate inputs
        if ((sideOne + sideTwo) <= sideThree || (sideOne + sideThree 
            <= sideTwo) || (sideTwo + sideThree) <= sideOne) {
                System.out.println("Those sides do not specify a valid "
                + "triangle.");
        }
        else {
            perimeter = sideOne + sideTwo + sideThree;
            System.out.println("The perimeter of the triangle is " 
                + perimeter);
        }
    }
}