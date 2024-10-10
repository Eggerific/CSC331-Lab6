public class HotAirBalloon extends AirTransportation{

    private double balloonVolume;

    public HotAirBalloon(String name, double cost, int capacity, double speed, boolean isRental, double balloonVolume){
        super(name, cost, capacity, speed, isRental);
        this.balloonVolume = balloonVolume;
    }
    public double getBalloonVolume() {return balloonVolume;}

    public void setBalloonVolume(double hasGears) {this.balloonVolume =  balloonVolume;}

    @Override
    public String toString(){
        return super.toString() + "It has a volume of " + balloonVolume + " cubic feet.";
    }

}
