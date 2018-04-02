public class Car extends Vehicle implements IMove {

    public Car(double latitude, double longitude, double price, double speed, int year){
        super(latitude, longitude, price, speed, year);
    }

    public class Drive_Type {
        String type;

        public Drive_Type(String type){
            this.type = type;
        }

        void display_drive_type() {
            System.out.printf("I'm Drive_Type. Мій тип %s\n", type);
        }
    }

    public class Transmission {
        String type;
        int number_of_degrees;

        public Transmission(String type, int number_of_degrees){
            this.type = type;
            this.number_of_degrees = number_of_degrees;
        }

        void display_transmission() {
            System.out.printf("I'm Transmission. Мій тип %s, кількість ступенів %d\n", type, number_of_degrees);
        }
    }

    public class dimensions {
        int length, width, height, wheelbase;

        public dimensions(int length, int width, int height, int wheelbase){
            this.length = length;
            this.width = width;
            this.height = height;
            this.wheelbase = wheelbase;
        }

        void display_dimensions() {
            System.out.printf("I'm dimension_car. Довжина %d мм, ширина %d мм, висота %d мм, колесна база %d мм\n", length, width, height, wheelbase);
        }
    }

    public static class trailer  {
        double v;

        public trailer (double v){
            this.v = v;
        }

        public void display_dimensions() {
            System.out.printf("I'm trailer. Мій об'єм %.3f л\n", v);
        }
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
