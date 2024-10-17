public class Automobile extends LandTransportation {

    // if we need a private variable we can use fuelType
    private boolean isElectric;

    public Automobile(String name, double cost, int capacity, double speed, boolean isRental, boolean isElectric){
        super(name, cost, capacity, speed, isRental);
        this.isElectric = isElectric;
    }

    @Override
    public String toString(){
        return super.toString() + " It is " + (isElectric ? "electric." : "not electric.");
    }

}

