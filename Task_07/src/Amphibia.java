public class Amphibia extends Car implements IMove, ISwim {

    public Amphibia(double latitude, double longitude, double price, double speed, int year){
        super(latitude, longitude, price, speed, year);
    }

    private double min_range = 0.3, max_range = 0.9;
    private double k = Math.random() * (max_range-min_range) + min_range;;

    public double getSpeed(Class inter) {
        if (IMove.class.equals(inter))
            return super.getSpeed();
        else if (ISwim.class.equals(inter))
            return k * super.getSpeed();
        else return 0;
    }


    @Override
    void display_coord() {
        System.out.printf("I'm Amphibia. Мої координати: широта %.3f; довгота %.3f\n", super.getLatitude(), super.getLongitude());
    }

    @Override
    void display_price() {
        System.out.printf("I'm Amphibia. Моя вартість: %.3f\n", super.getPrice());
    }

    @Override
    void display_speed() {
        System.out.printf("I'm Amphibia. Моя швидкість: %.3f. Моя швидкість у воді: %.3f\n", super.getSpeed(), k*super.getSpeed());
    }

    @Override
    void display_year() {
        System.out.printf("I'm Amphibia. Мій рік випуску: %d\n", super.getYear());
    }

    @Override
    public void move() {
        System.out.printf("I'm Amphibia і я можу їздити\n");
    }

    @Override
    public void swim() {
        System.out.printf("I'm Amphibia і я можу плавати\n");
    }

}
