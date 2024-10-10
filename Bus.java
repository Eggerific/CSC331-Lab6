public class Bus extends LandTransportation {

    // for travel directions, only for bus class
    private int numOfStops;

    //Constructor for Bus class
    public Bus(String name, double cost, int capacity, double speed, boolean isRental, int numOfStops){
        super(name, cost, capacity, speed, isRental);
        this.numOfStops = numOfStops;
    }
    public int getNumOfStops() {return numOfStops;}

    public  void setNumOfStops(int numOfStops) {this.numOfStops =  numOfStops;}

    @Override
    public String toString(){
        return super.toString() + " It has " + numOfStops + " stops.";
    }

}
