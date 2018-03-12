package za.ac.cput.srp;

import junit.framework.TestCase;
import za.ac.cput.srp.Obey.StaffMember;
import za.ac.cput.srp.Violate.StaffMemberv;

public class SRPTest extends TestCase {

    StaffMember smo = new StaffMember();
    public void testName() throws Exception
    {
        smo.setName("Bulelani");
        assertEquals(smo.getName(),"Bulelani");
    }

    public void testSal() throws Exception
    {
        smo.setSal(16000);
        assertEquals(smo.getSal(),16000);
    }

    public void testStaffNo() throws Exception
    {
        smo.setStaffNo(67788);
        assertEquals(smo.getStaffNo(),67788);
    }


    StaffMemberv smv = new StaffMemberv();
    public void testName1() throws Exception
    {
        smv.setName("Fani");
        assertEquals(smv.getName(),"Fani");
    }

    public void testSal1() throws Exception
    {
        smv.setSal(17000);
        assertEquals(smv.getSal(),17000);
    }

    public void testStaffNo1() throws Exception
    {
        smv.setStaffNo(91123);
        assertEquals(smv.getStaffNo(),91123);
    }
}
