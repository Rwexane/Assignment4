package za.ac.cput.adp.Obey;

public class StockUsrAccount {

    public void buy(StockOptions so, String identity, double purchaceAmnt)
    {
        if(so.checks("Bulelani"))
        {
            System.out.println("Amount R" + purchaceAmnt + " into " + identity + " account");
        }
    }

    public double getAvailableFunds(String accNum)
    {
        System.out.println("Remainder");
        return 0.1;
    }
}
