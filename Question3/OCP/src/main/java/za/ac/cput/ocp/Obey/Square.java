package za.ac.cput.ocp.Obey;

public class Square implements TotalLength {

    int length = 4;
    public int totalLength()
    {
        return ((int) Math.sqrt((length * length) / 2));
    }
}
