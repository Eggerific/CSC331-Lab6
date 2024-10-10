public class Ship extends WaterTransportation{

    private int numberOfDecks;

    public Ship(String name, double cost, int capacity, double speed, boolean isRental, int numberOfDecks){
        super(name, cost, capacity, speed, isRental);
        this.numberOfDecks = numberOfDecks;
    }
    public int getNumberOfDecks() {return numberOfDecks;}

    public void setNumberOfDecks(int numberOfDecks) {this.numberOfDecks =  numberOfDecks;}

    @Override
    public String toString(){
        return super.toString() + " It has " + numberOfDecks + " deck(s).";
    }

}
