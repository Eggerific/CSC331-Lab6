public class Automobile extends LandTransportation {

    private int mpg;

    public Automobile(String name, double cost, int capacity, double speed, boolean isRental){
        super(name, cost, capacity, speed, isRental, int mpg);
        this.mpg = mpg;
    }
    public int getMpg() {return mpg;}
    public void setMpg(int mpg) {return mpg;}

    @Override
    public String toString(){
        return "Automobile: " + super.toString() + "Miles per gallon:" + mpg;
    }

}

