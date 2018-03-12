package za.ac.cput.adp.Violate;

public class StockUserAccountv {

    private StockInvestorv userv;

    public void buy(String identity, double amnt)
    {
        userv = new StockInvestorv();
        if(userv.checks(identity))
        {
            System.out.println("You deposited R" + amnt + " into " + identity + " account");
        }
    }

    public double getBal(String accNum)
    {
        System.out.println("Remainder");
        return 0;
    }
}
