public class Helicopter extends AirTransportation{

    private int rotorCount;

    public Helicopter(String name, double cost, int capacity, double speed, boolean isRental, int rotorCount){
        super(name, cost, capacity, speed, isRental);
        this.rotorCount = rotorCount;
    }
    public int getRotorCount() {return rotorCount;}

    public void setRotorCount(int rotorCount) {this.rotorCount =  rotorCount;}

    @Override
    public String toString(){
        return super.toString() + " It has a rotor count of " + rotorCount + ".";
    }

}

