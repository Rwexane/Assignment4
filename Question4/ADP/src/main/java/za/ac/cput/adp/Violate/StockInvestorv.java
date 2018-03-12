package za.ac.cput.adp.Violate;

public class StockInvestorv extends StockUserAccountv {

    public double getUserBal(String accNum)
    {
        return getBal(accNum);
    }

    public boolean checks(String identity)
    {
        return true;
    }
}
