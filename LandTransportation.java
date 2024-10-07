public class LandTransportation extends Transportation{

    // Constructor
    public LandTransportation(String name, double cost, int capacity, double speed, boolean isRental){

        //used to access methods from super class(Transportation)
        super(name, cost, capacity, speed, isRental);

    }

    @Override
    public String toString(){
        return "Land Transportation: " + super.toString();
    }

}
