package chapter7;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.time.DayOfWeek;
import java.util.Scanner;

public class DayoftheWeek {



    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a number from 1 to 7");
        int day = scanner.nextInt();
        scanner.close();
        DayOfWeek week[] = DayOfWeek.values();
        for (DayOfWeek a : week) {
            if (day < 1 || day > 7) {
                System.out.println("this is an invalid day of the week");
                break;
            }
            System.out.println(week[day-1]);
            break;
        }



    }




}
