package za.ac.cput.dip;

import junit.framework.TestCase;
import za.ac.cput.dip.Obey.Chicken;
import za.ac.cput.dip.Obey.Fish;
import za.ac.cput.dip.Obey.Resturant;
import za.ac.cput.dip.Violate.Chicken2;
import za.ac.cput.dip.Violate.Fish2;
import za.ac.cput.dip.Violate.Resturant1;

public class TestDIP extends TestCase {
    Chicken chicken = new Chicken();
    Fish fish = new Fish();
    Resturant res = new Resturant();

    public void testFish() throws Exception{
        assertEquals(res.Fish1().getClass(), fish.getClass());
    }

    public void testChicken() throws Exception{
        assertEquals(res.Chicken1().getClass(), chicken.getClass());
    }

    Resturant1 resturant1 = new Resturant1();
    Chicken2 chicken2 = new Chicken2();
    Fish2 fish2 = new Fish2();

    public void testFish1() throws Exception{
        assertEquals(resturant1.Fish2().getClass(), fish2.getClass());
    }

    public void testChicken1(){
        assertEquals(resturant1.Chicken2().getClass(), chicken2.getClass());
    }
}
