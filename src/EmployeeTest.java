import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Employeemodel emp = new Employeemodel();
    EmployeeBusinessLogic eb= new EmployeeBusinessLogic();
    @Test
    public void calYearlySalry()
    {
      emp.setName("Shorab");
      emp.setMonthlysalary(10000);
      emp.setAge(29);
        double v = eb.calYearlySalry(emp);
        assertEquals(120000,v,0.0);
    }


    @Test
    public void calAppraisal()
    {
        emp.setName("Abhi");
        emp.setMonthlysalary(20000);
        emp.setAge(30);
        double ap=eb.calYearlyAppraisal(emp);
        assertEquals(2000,ap,0.0);
    }
}
