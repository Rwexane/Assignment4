package za.ac.cput.oopprinciples;

import java.io.Serializable;

public class Car implements Serializable {
    String make;
    int model;

    public Car() {
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

    public String find() {
        String res;

        if (getModel() > 2001 & getModel() < 2018) {
            res = "Qualifies for insurance";
        } else {
            res = "Does not qualify for insurance";
        }
        return res;
    }
}
