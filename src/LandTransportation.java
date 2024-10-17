public class LandTransportation extends Transportation{

    // Constructor
    public LandTransportation(String name, double cost, int capacity, double speed, boolean isRental){

        //used to access methods from super class(Transportation)
        super(name, cost, capacity, speed, isRental);

    }

    // same string from super Transportation class
    @Override
    public String toString(){
        return super.toString();
    }

}
