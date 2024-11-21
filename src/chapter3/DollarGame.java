package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main (String[] arg){
        //Get cents
        System.out.println("How many cents do you like?");
        Scanner scanner = new Scanner (System.in);
        int cents = scanner.nextInt();

        //Get dims
        System.out.println("How many dims do you like?");
        int dims = scanner.nextInt();

        //Get quarter
        System.out.println("How many quarter do you like?");
        int quarter = scanner.nextInt();

        double total = ((quarter * 0.25) + (dims * 0.10) + (cents * 0.50));

        if (total > 1.00) {
            double extra = total - 1;
            System.out.println("Oh! your total exceed 1 dollar by " + extra + "cents");
        } if (total < 1.00){
            double less = 1 - total;
            System.out.println("Oh! your total is under 1 dollar by " + less + "cents");
        } if (total == 1.00) {
            System.out.println("Oh! that equals one dollar. You win!");
        }




    }
}

