package za.ac.cput.ocp;

import junit.framework.TestCase;
import za.ac.cput.ocp.Obey.OCPMain;

public class TestOCP extends TestCase {

    OCPMain ocpm = new OCPMain();

    public void testSquareLength() throws Exception {
        assertEquals(ocpm.getSquareLength(), 2);
    }


    public void testSquareRadius() throws Exception {
        assertEquals(ocpm.getRectangleLength(), 3);
    }

    za.ac.cput.ocp.Violate.OCPMain ocpv = new za.ac.cput.ocp.Violate.OCPMain();

    public void testLength() throws Exception
    {
        assertEquals(ocpv.getSquare(), 6);
    }
}
