public class Transportation {

    // initialized instance variables
    private String name;
    private double cost;
    private int capacity;
    private double speed;
    private boolean isRental;

    // CONSTRUCTOR
    public Transportation(String name, double cost, int capacity, double speed, boolean isRental){

        this.name  = name;
        this.cost = cost;
        this.capacity = capacity;
        this.speed = speed;
        this.isRental = isRental;

    }

    // getters
    public String getName() { return name; }
    public double getCost() { return cost; }
    public int getCapacity() { return capacity; }
    public double getSpeed() { return speed; }
    public boolean isRental() { return isRental; }

    // setters
    public void setName(String name) { this.name = name; }
    public void setCost(double cost) { this.cost = cost; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public void setSpeed(double speed) { this.speed = speed; }
    public void setRental(boolean rental) { isRental = rental; }

    // toString method for Super class
    @Override
    public String toString(){
        return name + " costs $" + cost +
                ", and it holds " + capacity + " passenger(s)," +
                " has a average speed of " + speed + " km/h, " +
                "and is " + (isRental ? "available for rental." : "ticketed.");
    }
}