public class HotAirBalloon extends AirTransportation{

    private int balloonVolume;

    public HotAirBalloon(String name, double cost, int capacity, double speed, boolean isRental, int balloonVolume){
        super(name, cost, capacity, speed, isRental);
        this.balloonVolume = balloonVolume;
    }
    public int getBalloonVolume() {return balloonVolume;}

    public void setBalloonVolume(int hasGears) {this.balloonVolume =  balloonVolume;}

    @Override
    public String toString(){
        return super.toString() + "It has a volume of " + balloonVolume + " cubic feet.";
    }

}
