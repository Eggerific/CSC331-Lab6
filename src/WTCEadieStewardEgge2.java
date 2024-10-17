/**
 * Names: Jordan E., Emma S., Delsin E.
 * Date: 10/2024
 * Purpose: Driver file for all other classes
 */

import java.util.Scanner;

public class WTCEadieStewardEgge2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continue_ = true;
        System.out.println("Welcome to Wilmington Travel Center!\n");

        // ask user what transport type
        while (continue_) {
            System.out.println("What type of transport would you like to travel in(Land, Air, or Water)? ");
            String transportType = scanner.nextLine();

            if (transportType.equals("Air")) {
                System.out.println("details");
            }
            System.out.println("If you are sure about your choice type Yes. If not, type No.");
            String answer = scanner.nextLine();

            continue_ = answer.equalsIgnoreCase("No");
        }

    }
}