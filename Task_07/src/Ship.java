public class Ship extends Vehicle implements ISwim {
    int passengers;
    String port;

    public Ship(double latitude, double longitude, double price, double speed, int year, int passengers, String port){
        super(latitude, longitude, price, speed, year);
        this.passengers = passengers;
        this.port = port;
    }

    public int getPassengers() {
        return passengers;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    void display_coord() {
        System.out.printf("I'm Ship. Мої координати: широта %.3f; довгота %.3f\n", super.getLatitude(), super.getLongitude());
    }

    @Override
    void display_price() {
        System.out.printf("I'm Ship. Моя вартість: %.3f\n", super.getPrice());
    }

    @Override
    void display_speed() {
        System.out.printf("I'm Ship. Моя швидкість: %.3f\n", super.getSpeed());
    }

    @Override
    void display_year() {
        System.out.printf("I'm Ship. Мій рік випуску: %d\n", super.getYear());
    }

    @Override
    public void swim() {
        System.out.printf("I'm Ship і я можу плавати\n");
    }

}
