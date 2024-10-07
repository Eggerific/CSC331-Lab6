public class Plane extends AirTransportation{

    private int wingSpan;

    public Plane(String name, double cost, int capacity, double speed, boolean isRental, int wingSpan){
        super(name, cost, capacity, speed, isRental);
        this.wingSpan = wingSpan;
    }
    public int getWingSpan() {return wingSpan;}

    public void setWingSpan(int wingSpan) {this.wingSpan =  wingSpan;}

    @Override
    public String toString(){
        return super.toString() + "It has a wing span of " + wingSpan + " meters.";
    }

}
