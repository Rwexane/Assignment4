package za.ac.cput.adp.Obey;

public class StockActivities {

    private StockOptions so;

    public StockActivities(StockOptions so)
    {
        this.so = so;
    }

    public void UserInstructions()
    {
        so.getUsersBal("2222");
    }
}
