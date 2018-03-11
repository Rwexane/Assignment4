package za.ac.cput.oopprinciples.Encapsulation;

import junit.framework.TestCase;
import za.ac.cput.oopprinciples.Inheritance.MotorBike;

public class InheritanceTest extends TestCase
{
    public void testMotorBike() throws Exception{
        MotorBike mb = new MotorBike();

        mb.setModel(2018);
        assertEquals(mb.getModel(), 2018);
    }
}
