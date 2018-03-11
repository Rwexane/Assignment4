package za.ac.cput.oopprinciples.Polymorphism;

public class Fruit
{
    String season;
    String shape;

    public Fruit(String season, String shape){
        this.season = season;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "This fruit is mostly found in the "+season+" season and is "+shape+" shape";
    }
}
