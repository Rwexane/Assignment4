package za.ac.cput.adp.Obey;

public interface StockOptions {

    void buy(StockOptions so, String identity, double purchaceAmm);
    double getAvailableFunds(String accNum);
    double getUsersBal(String accNum);
    boolean checks(String identity);
}
