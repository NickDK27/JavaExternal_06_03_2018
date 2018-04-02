public class Vehicle {
    private double latitude, longitude, price, speed;
    private int year;

    public Vehicle(double latitude, double longitude, double price, double speed, int year) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public class Engine {
        private String type, marka_toplyva;
        private double v;
        private int klapany, power, max_speed;
        private double up_to_100, fuel_na_100;
        private String power_supply_system;
        private int diameter_cylinder;

        public Engine(String type, String marka_toplyva, double v, int klapany, int power, int max_speed, double up_to_100, double fuel_na_100, String power_supply_system, int diameter_cylinder) {
            this.type = type;
            this.marka_toplyva = marka_toplyva;
            this.v = v;
            this.klapany = klapany;
            this.power = power;
            this.max_speed = max_speed;
            this.up_to_100 = up_to_100;
            this.fuel_na_100 = fuel_na_100;
            this.power_supply_system = power_supply_system;
            this.diameter_cylinder = diameter_cylinder;
        }

        public void display_engine() {
            System.out.printf("I'm Engine. Мій тип %s, марка палива %s, об'єм двигуна %.3f см^3, кількість клапанів %d, потужність %d к.с.," +
                            " максимальна швидкість %d км/год, розгін до 100 км/год за %.3f с, використання палива на 100 км приблизно %.3f л, система живлення %s, діаметр циліндра %d мм\n",
                            type, marka_toplyva, v, klapany, power, max_speed, up_to_100, fuel_na_100, power_supply_system, diameter_cylinder);
        }
    }

    public class brakes {
        String type_front, type_rear;

        public brakes(String type_front, String type_rear){
            this.type_front = type_front;
            this.type_rear = type_rear;
        }

        void display_brakes() {
            System.out.printf("I'm Brakes. Передні мають тип %s, задні - тип %s\n", type_front, type_rear);
        }
    }

    public interface dimensions{
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void display_coord() {
    }

    void display_price() {
    }

    void display_speed() {
    }

    void display_year() {
    }

}
