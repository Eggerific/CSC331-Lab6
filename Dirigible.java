public class Dirigible extends AirTransportation{

    private double maxAltitude;

    public Dirigible(String name, double cost, int capacity, double speed, boolean isRental, double maxAltitude){
        super(name, cost, capacity, speed, isRental);
        this.maxAltitude = maxAltitude;
    }
    public double getMaxAltitude() {return maxAltitude;}

    public void setMaxAltitude(double maxAltitude) {this.maxAltitude =  maxAltitude;}

    @Override
    public String toString(){
        return super.toString() + " It has a max altitude of " + maxAltitude + " feet.";
    }
}
