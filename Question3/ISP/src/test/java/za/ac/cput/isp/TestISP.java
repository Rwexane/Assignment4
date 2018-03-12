package za.ac.cput.isp;

import junit.framework.TestCase;
import za.ac.cput.isp.Obey.Audi;
import za.ac.cput.isp.Obey.BMW;
import za.ac.cput.isp.Violate.BMW1;

public class TestISP extends TestCase {
    public void testViolate() throws Exception{
        BMW1 bmw1 = new BMW1();

        bmw1.colour1();
        bmw1.model1();
        bmw1.transmission1();
        bmw1.brand1();
    }

    public void testObey() throws Exception{

        BMW bmw = new BMW();

        bmw.colour();
        bmw.model();
        bmw.transmission();
        bmw.brand();

        Audi audi = new Audi();

        audi.colour();
        audi.model();
        audi.transmission();
        audi.brand();
    }
}
