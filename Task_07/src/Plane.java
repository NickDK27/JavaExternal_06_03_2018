public class Plane extends Vehicle implements IFly {
    double height;
    int passengers;

    public Plane(double latitude, double longitude, double price, double speed, int year, double height, int passengers){
        super(latitude, longitude, price, speed, year);
        this.height = height;
        this.passengers = passengers;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    void display_coord() {
        System.out.printf("I'm Plane. Мої координати: широта %.3f; довгота %.3f\n", super.getLatitude(), super.getLongitude());
    }

    @Override
    void display_price() {
        System.out.printf("I'm Plane. Моя вартість: %.3f\n", super.getPrice());
    }

    @Override
    void display_speed() {
        System.out.printf("I'm Plane. Моя швидкість: %.3f. Я крутий )))\n", super.getSpeed());
    }

    @Override
    void display_year() {
        System.out.printf("I'm Plane. Мій рік випуску: %d\n", super.getYear());
    }

    @Override
    public void fly() {
        System.out.printf("I'm Plane і я можу літати\n");
    }
}
