public class Train extends LandTransportation{

    private int numCarriages;

    public Train(String name, double cost, int capacity, double speed, boolean isRental, int numCarriages){
        super(name, cost, capacity, speed, isRental);
        this.numCarriages = numCarriages;
    }
    public int getNumCarriages() {return numCarriages;}

    public void setNumCarriages(int numCarriages) {this.numCarriages =  numCarriages;}

    @Override
    public String toString(){
        return super.toString() + "It has " + numCarriages + " carriages.";
    }

}
