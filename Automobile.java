public class Automobile extends LandTransportation {

    // if we need a private variable we can use fuelType

    public Automobile(String name, double cost, int capacity, double speed, boolean isRental){
        super(name, cost, capacity, speed, isRental);
    }

    @Override
    public String toString(){
        return "Automobile: " + super.toString();
    }

}

