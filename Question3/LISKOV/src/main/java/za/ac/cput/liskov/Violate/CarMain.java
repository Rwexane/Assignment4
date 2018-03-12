package za.ac.cput.liskov.Violate;

public class CarMain {

    Vehicle vehicle;

    public int getBusSize() {
        Bus bus = new Bus();
        return bus.getSize();
    }

    public int getCarWidth() {
        vehicle = new Car();
        return vehicle.getWidth();

    }
}
