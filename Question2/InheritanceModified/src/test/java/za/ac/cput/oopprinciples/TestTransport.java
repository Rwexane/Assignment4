package za.ac.cput.oopprinciples;

import junit.framework.TestCase;

public class TestTransport extends TestCase
{
    Car c = new Audi().getCar();

    public void testModel() throws Exception {
        c.setModel(2011);
        assertEquals(c.getModel(),2011);
    }


    public void testMake() throws Exception {
        c.setMake("Audi A4");
        assertEquals(c.getMake(),"Audi A4");
    }
}
