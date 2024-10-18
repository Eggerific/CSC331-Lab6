/**
 * Names: Jordan E., Emma S., Delsin E.
 * Date: 10/2024
 * Purpose: Driver file for all other classes
 */

import java.util.Scanner;

public class WTCEadieStewardEgge2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Wilmington Travel Center!\n");

        // ask user what transport type

        System.out.println("What type of transport would you like to travel in (Land, Air, or Water)? ");
        String transportType = scanner.nextLine();

        Transportation selectedTransportType = null;

        switch (transportType) {
            case "Land":
                LandTransportation[] array = new LandTransportation[4];

                array[0] = new LandTransportation("Bus", 30, 50, 60, false);
                array[1] = new LandTransportation("Bike", 35, 2, 15, true);
                array[2] = new LandTransportation("Automobile", 75, 5, 70, true);
                array[3] = new LandTransportation("Train", 30, 72, 100, false);
                System.out.printf("%s%10s%15s%10s%20s%n%n", "Rental?", "Cost", "Capacity", "Speed", "Transportation");

                for (LandTransportation land : array) {
                    System.out.println(land.isRental()+"       $"+land.getCost()+"         "+land.getCapacity()+"          "+land.getSpeed()+" km/h         "+land.getName());
                }
                System.out.println("\nPlease enter your specific transport mode: ");
                String landTransport = scanner.nextLine();
                if (landTransport.equals("Bus")) {
                    Bus bus = new Bus("Bus", 30, 50, 60, false, 50);
                    System.out.println(bus.toString());
                } else if (landTransport.equals("Automobile")) {
                    Automobile car = new Automobile("Automobile", 75, 5, 70, true, true);
                    System.out.println(car.toString());
                } else if (landTransport.equals("Train")) {
                    Train train = new Train("Train", 30, 72, 100, false, 9);
                    System.out.println(train.toString());
                } else if (landTransport.equals("Bike")) {
                    Bike bike = new Bike("Bike", 35, 2, 15, true, true);
                    System.out.print(bike.toString());
                }
                break;

            case "Air":
                AirTransportation[] arrayAir = new AirTransportation[4];

                arrayAir[0] = new AirTransportation("Plane", 100, 150, 500, false);
                arrayAir[1] = new AirTransportation("Helicopter", 300, 5, 150, true);
                arrayAir[2] = new AirTransportation("Dirigible", 200, 30, 80, false);
                arrayAir[3] = new AirTransportation("Hot Air Balloon", 150, 4, 10, true);
                System.out.printf("%s%10s%15s%10s%20s%n%n", "Rental?", "Cost", "Capacity", "Speed", "Transportation");
                for (AirTransportation air : arrayAir) {
                    System.out.println(air.isRental() + "       $" + air.getCost() + "         " + air.getCapacity() + "          " + air.getSpeed() + " km/h         " + air.getName());
                }
                System.out.println("\nPlease enter your specific transport mode: ");
                String airTransport = scanner.nextLine();
                if (airTransport.equals("Plane")) {
                    Plane plane = new Plane("Plane", 100, 150, 500, false, 130);
                    System.out.println(plane.toString());
                } else if (airTransport.equals("Helicopter")) {
                    Helicopter heli = new Helicopter("Helicopter", 300, 5, 150, true, 5);
                    System.out.println(heli.toString());
                } else if (airTransport.equals("Dirigible")) {
                    Dirigible dirigible = new Dirigible("Dirigible", 200, 30, 80, false, 10000);
                    System.out.println(dirigible.toString());
                }else if (airTransport.equals("Hot Air Balloon")) {
                    HotAirBalloon balloon = new HotAirBalloon("Hot Air Balloon", 150, 4, 10, true, 77000);
                    System.out.println(balloon.toString());
                }
                break;

            case "Water":
                WaterTransportation[] arrayWater = new WaterTransportation[3];

                arrayWater[0] = new WaterTransportation("Boat", 100, 8, 40, true);
                arrayWater[1] = new WaterTransportation("Ship", 300, 1000, 30, false);
                arrayWater[2] = new WaterTransportation("Submarine", 500, 20, 25, false);

                for (WaterTransportation water : arrayWater) {
                    System.out.println(water.isRental() + "       $" + water.getCost() + "         " + water.getCapacity() + "          " + water.getSpeed() + " km/h         " + water.getName());
                }
                System.out.println("\nPlease enter your specific transport mode: ");
                String waterTransport = scanner.nextLine();

                if (waterTransport.equals("Boat")) {
                    Boat boat = new Boat("Boat", 100, 8, 40, true, true);
                    System.out.println(boat.toString());
                } else if (waterTransport.equals("Ship")) {
                    Ship ship = new Ship("Ship", 300, 1000, 30, false, 4);
                    System.out.println(ship.toString());
                } else if (waterTransport.equals("Submarine")) {
                    Submarine sub = new Submarine("Submarine", 500, 20, 25, false, true);
                    System.out.println(sub.toString());
                }
                break;

            default:
                System.out.println("Option not available.");
                return;
        }
        System.out.println("If you are confident with your selection, type Yes. If not, type No: ");
        String continue_ = scanner.nextLine();
        if (!continue_.equalsIgnoreCase("Yes")) {
            System.out.println("Please restart");
            return;
        }
    }
}