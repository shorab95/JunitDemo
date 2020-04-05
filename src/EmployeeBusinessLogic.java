public class EmployeeBusinessLogic {

    public double calYearlySalry(Employeemodel emp) {
        double yearlySalry = 0;
        yearlySalry = emp.getMonthlysalary() * 12;
        return yearlySalry;
    }

    public double calYearlyAppraisal(Employeemodel emp) {
        double yearlyAppraisal = 0;
        if (emp.getMonthlysalary() > 10000) {
            yearlyAppraisal = 2000;
            return yearlyAppraisal;
        }
        else
        {
            yearlyAppraisal=500;
            return yearlyAppraisal;
        }
    }
}