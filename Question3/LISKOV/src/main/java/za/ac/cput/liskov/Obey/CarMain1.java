package za.ac.cput.liskov.Obey;

public class CarMain1 {

    public int getBusSize1()
    {
        BusType bus = new Bus1();
        return bus.getBusSize1();
    }

    public int getWidth1()
    {
        Vehicle1 car =  new Car1();
        return car.getWidth1();
    }
}
