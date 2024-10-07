public class Bike extends LandTransportation {

    // only bike attributes
    // gears or no gears / mountain bike or road bike
    private boolean hasGears;

    // Constructor for Bike class
    public Bike(String name, double cost, int capacity, double speed, boolean isRental, boolean isElectric){
        super(name, cost, capacity, speed, isRental);
        this.hasGears = hasGears;
    }

    public boolean getHasGears() {return hasGears;}

    public  void setHasGears(boolean hasGears) {this.hasGears =  hasGears;}



    @Override
    public String toString(){
        return super.toString() + " It " + (hasGears ? "has" : "doesn't have") + " gears.";
    }

}
