public class BatMobile extends Car implements IMove, IFly  {

    public BatMobile(double latitude, double longitude, double price, double speed, int year){
        super(latitude, longitude, price, speed, year);
    }

    private double min_range = 7, max_range = 15;
    private double k = Math.random() * (max_range-min_range) + min_range;;

    public double getSpeed(Class inter) {
        if (IMove.class.equals(inter))
            return super.getSpeed();
        else if (IFly.class.equals(inter))
            return k * super.getSpeed();
        else return 0;
    }

    @Override
    void display_coord() {
        System.out.printf("I'm BatMobile. Мої координати: широта %.3f; довгота %.3f\n", super.getLatitude(), super.getLongitude());
    }

    @Override
    void display_price() {
        System.out.printf("I'm BatMobile. Моя вартість: %.3f\n", super.getPrice());
    }

    @Override
    void display_speed() {
        System.out.printf("I'm BatMobile. Моя швидкість по землі: %.3f. Моя швидкість у повітрі: %.3f\n", super.getSpeed(), k*super.getSpeed());
    }

    @Override
    void display_year() {
        System.out.printf("I'm BatMobile. Мій рік випуску: %d\n", super.getYear());
    }

    @Override
    public void move() {
        System.out.printf("I'm BatMobile і я можу їздити\n");
    }

    @Override
    public void fly() {
        System.out.printf("I'm BatMobile і я можу літати\n");
    }
}
