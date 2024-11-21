package chapter4;

import java.util.Random;

public class RolltheDieGame {
    public static void main(String[] arg){
        //Initialize what we know
        int maxspace = 20;
        int currentspace  = 0;
        int maxintent = 5;
        System.out.println("Welcome to Roll the Die! Let's begin...");

        for (int i=1; i<=maxintent; i++) {
            Random random = new Random();
            int die = random.nextInt(6) + 1;
            currentspace = currentspace + die;
            int togo = maxspace - currentspace;

            if (currentspace == maxspace) {
                System.out.print("You're on space " + currentspace + ". Congrats, you win!");
                break;
            } else if (currentspace > maxspace) {
                System.out.print("Unfortunately, that takes you past " + maxspace + " spaces. You lose!");
                break;
            } else if (i == maxintent && currentspace < maxspace) {
                System.out.println("You're on space " + currentspace + ".");
                System.out.println("Unfortunately, you didn't make it to all " +
                        maxspace + " spaces. You lose!");

            } else {
                System.out.println("Roll #" + i + ": You've rolled a" + die + "You are now on space " + currentspace + " and have" + togo + "more to go.");
            }
            System.out.println();
        }


    }
}
