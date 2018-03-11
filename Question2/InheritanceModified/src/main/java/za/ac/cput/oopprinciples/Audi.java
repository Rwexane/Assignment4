package za.ac.cput.oopprinciples;

public class Audi implements Transport
{
    private String make;
    private int model;
    public Car getCar()
    {
        Car car = new Car(make, model);
        return car;
    }
}
