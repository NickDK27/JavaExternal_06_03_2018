public class Car extends Vehicle implements IMove {

    public Car(double latitude, double longitude, double price, double speed, int year){
        super(latitude, longitude, price, speed, year);
    }

    @Override
    void display_coord() {
        System.out.printf("I'm Car. Мої координати: широта %.3f; довгота %.3f\n", super.getLatitude(), super.getLongitude());
    }

    @Override
    void display_price() {
        System.out.printf("I'm Car. Моя вартість: %.3f\n", super.getPrice());
    }

    @Override
    void display_speed() {
        System.out.printf("I'm Car. Моя швидкість: %.3f\n", super.getSpeed());
    }

    @Override
    void display_year() {
        System.out.printf("I'm Car. Мій рік випуску: %d\n", super.getYear());
    }

    @Override
    public void move() {
        System.out.printf("I'm Car і я можу їздити\n");
    }

}
