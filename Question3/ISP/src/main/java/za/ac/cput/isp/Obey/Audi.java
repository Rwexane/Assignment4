package za.ac.cput.isp.Obey;

public class Audi implements Brand, Colour, Model, Transmission {
    public void colour(){
        System.out.println("Black");
    }

    public void transmission(){
        System.out.println("Manual");
    }

    public void model(){
        System.out.println("2011");
    }

    public void brand() {
        System.out.println("Audi1");
        System.out.println("");
    }

}
