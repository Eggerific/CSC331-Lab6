public class Bike extends LandTransportation {

    // only bike attributes
    // gears or no gears / mountain bike or road bike
    private int numOfGears;

    // Constructor for Bike class
    public Bike(String name, double cost, int capacity, double speed, boolean isRental, boolean isElectric){
        super(name, cost, capacity, speed, isRental);
        this.numOfGears = numOfGears;
    }

    public int getNumOfGears() {return numOfGears;}

    public  void setNumOfGears(int numOfGears) {this.numOfGears =  numOfGears;}



    @Override
    public String toString(){
        return super.toString() + "Number of gears: " + numOfGears;
    }

}
