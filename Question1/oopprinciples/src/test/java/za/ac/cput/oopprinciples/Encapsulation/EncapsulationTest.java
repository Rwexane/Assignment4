package za.ac.cput.oopprinciples.Encapsulation;

import junit.framework.TestCase;

public class EncapsulationTest extends TestCase
{
    Car car = new Car();

    public void testMake() throws Exception{
        car.setMake("Audi A4");
        assertEquals(car.getMake(), "Audi A4");
    }

    public void testModel() throws Exception{
        car.setModel(2011);
        assertEquals(car.getModel(), 2011);
    }
}