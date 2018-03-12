package za.ac.cput.srp.Violate;

public class StaffMemberv {

    private String name;
    private int staffNo;
    private int sal;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setStaffNo(int staffNo)
    {
        this.staffNo = staffNo;
    }

    public void setSal(int sal)
    {
        this.sal = sal;
    }

    public String getName()
    {
        return name;
    }

    public int getStaffNo()
    {
        return staffNo;
    }

    public int getSal()
    {
        return sal;
    }
    public int totalYearlyIncome()
    {
        return sal * 12;
    }
}
