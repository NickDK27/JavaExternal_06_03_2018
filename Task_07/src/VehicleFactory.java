class VehicleFactory extends AbstractVehicleFactory{
    private final int TYPE_VEHICLE = 3;
    @Override
    public Vehicle RandVehicle() {
        return GetVehicle((int)(Math.random()*TYPE_VEHICLE));
    }

    double min = 0, max = 180;
    int min_int = 0, max_int = 200;
    int min_year = 1950, max_year = 2018;

    @Override
    public Vehicle GetVehicle(int i) {
        switch (i) {
            case 0: return new Plane(random_s(min, max), random_s(min, max), random_s(min, max), random_s(min, 10*max), random_s(min_year, max_year), random_s(min, max), random_s(min_int, max_int) );
            case 1: return new Ship(random_s(min, max), random_s(min, max), random_s(min, max), random_s(min, max), random_s(min_year, max_year), random_s(min_int, max_int), "Номер порта " + String.valueOf(i) );
            case 2: return new Car(random_s(min, max), random_s(min, max), random_s(min, max), random_s(min, max), random_s(min_year, max_year));
            default:{
                System.out.println("Enter Vehicle");
                return null;
            }
        }
    }

    public int random_s(int min_range, int max_range){
        return (int)( Math.random() * (max_range-min_range) ) + min_range;
    }

    public double random_s(double min_range, double max_range){
        return Math.random() * (max_range-min_range) + min_range;
    }
}
