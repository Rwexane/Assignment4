package za.ac.cput.adp.Obey;

public class StockInvestor extends StockUsrAccount implements StockOptions {

    public double getUsersBal(String accNum) {
        return getAvailableFunds(accNum);
    }

    public boolean checks(String identity) {
        return true;
    }
}
