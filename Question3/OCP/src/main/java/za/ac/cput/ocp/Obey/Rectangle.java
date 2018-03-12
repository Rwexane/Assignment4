package za.ac.cput.ocp.Obey;

public class Rectangle implements TotalLength {

    int length = 5;
    public int totalLength()
    {
        return ((int) Math.sqrt((length * length) / 2));
    }
}
