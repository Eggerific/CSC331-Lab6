public class Plane extends AirTransportation{

    private double wingSpan;

    public Plane(String name, double cost, int capacity, double speed, boolean isRental, double wingSpan){
        super(name, cost, capacity, speed, isRental);
        this.wingSpan = wingSpan;
    }
    public int getWingSpan() {return wingSpan;}

    public void setWingSpan(double wingSpan) {this.wingSpan =  wingSpan;}

    @Override
    public String toString(){
        return super.toString() + "Wingspan:" + wingSpan + " meters";
    }

}
