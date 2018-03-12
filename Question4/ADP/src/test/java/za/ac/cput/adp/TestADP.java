package za.ac.cput.adp;

import junit.framework.TestCase;
import za.ac.cput.adp.Obey.StockActivities;
import za.ac.cput.adp.Obey.StockInvestor;
import za.ac.cput.adp.Obey.StockUsrAccount;
import za.ac.cput.adp.Violate.StockUserAccountv;

public class TestADP extends TestCase {

    public void testObey() throws Exception{
        StockUsrAccount sta = new StockUsrAccount();
        sta.buy(new StockInvestor(), "Bulelani", 1200.000000);
        StockActivities sa = new StockActivities(new StockInvestor());
        sa.UserInstructions();
    }

    public void testViolate() throws Exception{
        StockUserAccountv stav = new StockUserAccountv();
        stav.buy("Bulelani", 1200.00000);
        stav.getBal("221321");
    }
}
