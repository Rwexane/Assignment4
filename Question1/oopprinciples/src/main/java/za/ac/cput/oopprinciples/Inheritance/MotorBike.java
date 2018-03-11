package za.ac.cput.oopprinciples.Inheritance;

import za.ac.cput.oopprinciples.Encapsulation.Car;

public class MotorBike extends Car
{
    String colour;

    public MotorBike(){
    }

    public MotorBike(String make, int model, String colour){
        super(make, model);
        this.colour = colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Make: "+getMake()+"Colour: "+getColour()+"Model: "+getModel();
    }
}
