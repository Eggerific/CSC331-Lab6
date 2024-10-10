public class Boat extends WaterTransportation{

    private boolean isMotorized;

    public Boat(String name, double cost, int capacity, double speed, boolean isRental, boolean isMotorized){
        super(name, cost, capacity, speed, isRental);
        this.isMotorized = isMotorized;
    }

    @Override
    public String toString(){
        return super.toString() + "It is " + (isMotorized ? "motorized." : "not motorized.");
    }

}
