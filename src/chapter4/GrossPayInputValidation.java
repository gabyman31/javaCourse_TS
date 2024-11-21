package chapter4;

import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
public class GrossPayInputValidation {
    public static void main(String args[]){
        //Initialize known variable
        int rate = 15;
        int maxHours = 40;

        //GET input for unknown variables
        System.out.println("Hoe many did your work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursworked = scanner.nextDouble();

        // Validate input
        while(hoursworked > maxHours|| hoursworked < 1){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again- ");
            hoursworked = scanner.nextDouble();


        }
        scanner.close();

        //Calculate gross
        double gross = rate * hoursworked;
        System.out.println("Gross pay: $" + gross);


    }
}
