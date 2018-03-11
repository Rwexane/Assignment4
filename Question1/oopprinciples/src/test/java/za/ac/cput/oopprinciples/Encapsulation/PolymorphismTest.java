package za.ac.cput.oopprinciples.Encapsulation;

import junit.framework.TestCase;
import za.ac.cput.oopprinciples.Polymorphism.Apple;
import za.ac.cput.oopprinciples.Polymorphism.Fruit;
import za.ac.cput.oopprinciples.Polymorphism.Mango;

public class PolymorphismTest  extends TestCase
{
    Fruit fruit = new Apple("All year", "Circular", 13,25);
    Fruit f = new Mango("Summer", "Oval", 18, 40);

    public void testApple() throws Exception{
        assertEquals(fruit.toString(), "This fruit is mostly found in the All year season and is Circular shape");
    }

    public void testMango(){
        assertEquals(f.toString(), "This fruit is mostly found in the Summer season and is Oval shape");
    }


}
