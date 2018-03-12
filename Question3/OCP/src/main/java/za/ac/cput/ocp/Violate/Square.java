package za.ac.cput.ocp.Violate;

public class Square extends TotalLength {

    int length = 4;
    public int totalLength()
    {
        return ((int) Math.sqrt((length * length) / 2));
    }
}
