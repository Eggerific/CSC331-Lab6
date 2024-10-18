/**
 * Names: Jordan E., Emma S., Delsin E.
 * Date: 10/2024
 * Purpose: Driver file for all other classes
 */

import java.util.Scanner;

public class WTCEadieStewardEgge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Wilmington Travel Center!\n");

        // ask user what transport type
        System.out.println("What type of transport would you like to travel in(Land, Air, or Water)? ");
        String transportType = scanner.nextLine();

        // 2. Display options for the transport type
        if (transportType.equalsIgnoreCase("Land")) {
            System.out.println("Available options for Land Transportation:");
            System.out.println("Type           | Cost  | Rental | Avg Speed | Passengers");
            System.out.println("---------------|-------|--------|-----------|-----------");
            System.out.println("Bus            | $50   | Ticket | 60 mph    | 50");
            System.out.println("Bike           | $10   | Rental | 15 mph    | 1");
            System.out.println("Automobile     | $70   | Rental | 45 mph    | 4");
            System.out.println("Train          | $100  | Ticket | 80 mph    | 1300");
        } else if (transportType.equalsIgnoreCase("Air")) {
            System.out.println("Available options for Air Transportation:");
            System.out.println("Type           | Cost  | Rental | Avg Speed | Passengers");
            System.out.println("---------------|-------|--------|-----------|-----------");
            System.out.println("Plane          | $500  | Ticket | 500 mph   | 150");
            System.out.println("Helicopter     | $300  | Rental | 150 mph   | 5");
            System.out.println("Dirigible      | $200  | Ticket | 80 mph    | 30");
            System.out.println("Hot Air Balloon| $150  | Rental | 10 mph    | 4");
        } else if (transportType.equalsIgnoreCase("Water")) {
            System.out.println("Available options for Water Transportation:");
            System.out.println("Type           | Cost  | Rental | Avg Speed | Passengers");
            System.out.println("---------------|-------|--------|-----------|-----------");
            System.out.println("Boat           | $100  | Rental | 40 mph    | 8");
            System.out.println("Ship           | $300  | Ticket | 30 mph    | 1000");
            System.out.println("Submarine      | $500  | Rental | 25 mph    | 20");
        } else {
            // Handle invalid transportation type
            System.out.println("Invalid transportation type selected. Please choose Land, Air, or Water.");
            return; // Exit early if invalid type is selected
        }

        // ask user specific mode of transport
        System.out.println("\nPlease enter a specific transportation: ");
        String userChoice = scanner.nextLine();

        //using polymorphism, create instance of the selected transport
        Transportation selectedTransportType = null;

        // if else, check which transportation they chose
        // create separate instances for specific type
        // LAND
        if (userChoice.equalsIgnoreCase("Bus")){
            // create instance using specific class
            selectedTransportType = new Bus("Bus", 50.00, 50, 60.00, false, 5);
        }
        else if (userChoice.equalsIgnoreCase("Bike")){
            selectedTransportType = new Bike("Bike", 10.00, 1, 15.00, true, true);
        }
        else if (userChoice.equalsIgnoreCase("Automobile")){
            selectedTransportType = new Automobile("Automobile", 10.00, 1, 45.00, true, true);
        }
        else if (userChoice.equalsIgnoreCase("Train")){
            selectedTransportType = new Train("Train", 10.00, 1, 100.00, false, 8);
        }
        // AIR
        else if (userChoice.equalsIgnoreCase("Plane")){
            selectedTransportType = new Plane("Plane", 500.00, 150, 500.00, false, 130);
        }
        else if (userChoice.equalsIgnoreCase("Helicopter")){
            selectedTransportType = new Helicopter("Helicopter", 300.00, 5, 150.00, true, 5);
        }
        else if (userChoice.equalsIgnoreCase("Dirigible")){
            selectedTransportType = new Dirigible("Dirigible", 200.00, 30, 80.00, false, 10000);
        }
        else if (userChoice.equalsIgnoreCase("Hot Air Balloon")){
            selectedTransportType = new HotAirBalloon("Hot Air Balloon", 150.00, 4, 10.00, true, 77000);
        }
        // WATER
        else if (userChoice.equalsIgnoreCase("Boat")){
            selectedTransportType = new Boat("Boat", 100.00, 8, 40.00, true, true);
        }
        else if (userChoice.equalsIgnoreCase("Ship")){
            selectedTransportType = new Ship("Ship", 300.00, 1000, 30.00, false, 4);
        }
        else if (userChoice.equalsIgnoreCase("Submarine")){
            selectedTransportType = new Submarine("Submarine", 500.00, 20, 25.00, true, true);
        }
        else {
            System.out.println("Invalid Choice.");
        }

        // USED TO TEST OUTPUTS
        System.out.println(selectedTransportType);
        assert selectedTransportType != null;
        System.out.println(selectedTransportType.getName());
        System.out.println(selectedTransportType.getCost());

        //1.) Ask the user to verify that this is the mode of transportation they want to use.
        //2.) Ask the user how many passengers need to travel using that mode of transportation.
        //3.) Display the total cost.
        //4.) Display travel instructions (what time their flight leaves, where they need to go to pick up a bike rental, etc.)
        // ______'instanceOf'_______
    }
}
