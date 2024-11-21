package chapter2;

import java.util.Scanner;

public class MadLibs_free_excercise2 {
    public static void main(String arg[]) {
        //get the season
        System.out.println("Please provide your favorite season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //get the number
        System.out.println("Please provide any integer number from 1 to 12");
        int cups = scanner.nextInt();

        //get the adjective
        System.out.println("Please provide any adjective");
        String description = scanner.next();
        scanner.close();

        System.out.println("On a " + description +"  "+ season+ " day, I drink a minimum of " + cups + " cups of coffee"  );
    }
}
