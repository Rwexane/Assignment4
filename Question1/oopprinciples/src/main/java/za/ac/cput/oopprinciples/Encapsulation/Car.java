package za.ac.cput.oopprinciples.Encapsulation;

public class Car
{
    String make;
    int model;

    public Car(){
    }

    public Car(String make, int model) {
        this.make = make;
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public int getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Make: "+getMake()+"Model: "+getModel();
    }
}
