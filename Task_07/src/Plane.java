public class Plane extends Vehicle implements IFly {
    double height;
    int passengers;

    public Plane(double latitude, double longitude, double price, double speed, int year, double height, int passengers){
        super(latitude, longitude, price, speed, year);
        this.height = height;
        this.passengers = passengers;
    }

    public class dimensions {
        double length, height, max_length_shipment, max_weigth_shipment;

        public dimensions(double length, double height, double max_length_shipment, double max_weigth_shipment){
            this.length = length;
            this.height = height;
            this.max_length_shipment = max_length_shipment;
            this.max_weigth_shipment = max_weigth_shipment;
        }

        void display_dimensions() {
            System.out.printf("I'm dimension_plane. Довжина %.3f м, висота %.3f м, максимальна довжина вантажу %.3f м, максимальна вага вантажу %.3f т\n", length, height, max_length_shipment, max_weigth_shipment);
        }
    }

    public class wing {
        double wingspan, square_of_one_wing;

        public wing(double wingspan, double square_of_one_wing){
            this.wingspan = wingspan;
            this.square_of_one_wing = square_of_one_wing;
        }

        void display_wing() {
            System.out.printf("I'm wing. Розмах крила %.3f м, площа одного крила %.3f м^2\n", wingspan, square_of_one_wing);
        }
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
