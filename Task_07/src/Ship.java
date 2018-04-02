public class Ship extends Vehicle implements ISwim {
    int passengers;
    String port;

    public Ship(double latitude, double longitude, double price, double speed, int year, int passengers, String port){
        super(latitude, longitude, price, speed, year);
        this.passengers = passengers;
        this.port = port;
    }

    public class Screw {
        int number_blade;

        public Screw(int number_blade){
            this.number_blade = number_blade;
        }

        void display_scew() {
            System.out.printf("I'm screw. Кількість лопастей %d\n", number_blade);
        }
    }

    public class type_of_sailing_equipment {
        String type;
        double square, max_speed, height, weight;

        public type_of_sailing_equipment(String type, double square, double max_speed, double height, double weight){
            this.type = type;
            this.square = square;
            this.max_speed = max_speed;
            this.height = height;
            this.weight = weight;
        }

        void display_type_of_sailing_equipment() {
            System.out.printf("I'm type_of_sailing_equipment. Тип парусного оснащення %s, площа паруса %.3f м^2, максимальна швидкість псть під парусами %.3f км/год, висота щогли %.3f м, вага щогли %.3f кг\n", type, square, max_speed, height, weight);
        }
    }

    public class dimensions {
        double length, length_waterline, width, thickness_of_the_sides, precipitate, height_of_the_sides, weight;

        public dimensions(double length, double length_waterline, double width, double thickness_of_the_sides, double precipitate, double height_of_the_sides, double weight){
            this.length = length;
            this.length_waterline = length_waterline;
            this.width = width;
            this.thickness_of_the_sides = thickness_of_the_sides;
            this.precipitate = precipitate;
            this.height_of_the_sides = height_of_the_sides;
            this.weight = weight;
        }

        void display_dimensions() {
            System.out.printf("I'm dimension_ship. Довжина %.3f м, довжина по ватерлінії %.3f м, ширина %.3f м, товщина бортів %.3f мм, осадка %.3f м, висота бортів %.3f м, вага %.3f кг\n", length, length_waterline, width, thickness_of_the_sides, precipitate, height_of_the_sides, weight);
        }
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
