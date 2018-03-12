package za.ac.cput.ocp.Obey;

public class OCPMain {

    TotalLength t;

    public int getSquareLength()
    {
        t = new Square();
        return t.totalLength();
    }

    public int getRectangleLength()
    {
        t = new Rectangle();
        return t.totalLength();
    }
}
