package za.ac.cput.ocp.Violate;

public class OCPMain {

    public int getLength(TotalLength t)
    {
        int length = 0;
        if(t.getShape().equals("circle"))
            length = 1;
        else
            length = 5;
        return length;
    }
    public int getSquare()
    {
        return getLength(new Square());
    }
}
