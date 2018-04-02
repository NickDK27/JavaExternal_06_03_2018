abstract class AbstractVehicleFactory {

    public abstract Vehicle GetVehicle(int i);
    public abstract Vehicle RandVehicle();
    public abstract int random_s(int min_range, int max_range);
    public abstract double random_s(double min_range, double max_range);
}