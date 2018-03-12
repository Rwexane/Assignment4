package za.ac.cput.liskov;

import za.ac.cput.liskov.Obey.CarMain1;
import za.ac.cput.liskov.Violate.CarMain;

import junit.framework.TestCase;

public class TestLISKOV extends TestCase {

    CarMain1 cmain1 = new CarMain1();


    public void testBusSize() throws Exception {
        assertEquals(cmain1.getBusSize1(), 200);
    }


    public void testWidth() throws Exception {
        assertEquals(cmain1.getWidth1(), 20);
    }

    CarMain cmain = new CarMain();

    public void testSize() throws Exception {
        assertEquals(cmain.getBusSize(),150);
    }

    public void testWidth1() throws Exception {
        assertEquals(cmain.getCarWidth(),12);
    }
}
