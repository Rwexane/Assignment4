package za.ac.cput.oopprinciples.Polymorphism;

public class Apple extends Fruit
{
    private int size;
    private int weight;

    public Apple(String season, String shape, int size, int weight) {
        super(season , shape);
        this.size = size;
        this.weight = weight;
    }
}
