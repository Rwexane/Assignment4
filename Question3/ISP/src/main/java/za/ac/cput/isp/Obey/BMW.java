package za.ac.cput.isp.Obey;

public class BMW implements Brand, Colour, Model, Transmission {
    public void colour(){
        System.out.println("White");
    }

    public void transmission(){
        System.out.println("Manual");
    }

    public void model(){
        System.out.println("2013");
    }

    public void brand() {
        System.out.println("BMW");
        System.out.println("");
    }
}
