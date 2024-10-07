public class Submarine extends WaterTransportation{

    // attribute only for submarine
    private boolean isNuclearPowered;

    // Constructor
    public Submarine(String name, double cost, int capacity, double speed, boolean isRental, boolean isNuclearPowered){
        super(name, cost, capacity, speed, isRental);
        this.isNuclearPowered = isNuclearPowered;
    }
    public boolean getIsNuclearPowered() {return isNuclearPowered;}

    public void setIsNuclearPowered(boolean isNuclearPowered) {this.isNuclearPowered =  isNuclearPowered;}

    // toString method
    @Override
    public String toString(){
        return super.toString() + " and is " + (isNuclearPowered ? "nuclear-powered" : "not nuclear-powered.");
    }

}
