public class Employee {
    private int employeeNumber;
    private double payRate;
    public static final int MAX_EMPLOYEE_NUMBER = 9999;
    public static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber <= 0) {
            this.employeeNumber = 1;
        } else if (employeeNumber > MAX_EMPLOYEE_NUMBER) {
            this.employeeNumber = MAX_EMPLOYEE_NUMBER;
        } else {
            this.employeeNumber = employeeNumber;
        }
        if (payRate <= 0) {
            this.payRate = 0;
        } else {
            this.payRate = payRate;
        }
    }

    public double calculateRegularPay(double hoursWorked) {
        double regularHours = Math.min(40, hoursWorked);
        return regularHours * payRate;
    }

    public double calculateOvertimePay(double hoursWorked) {
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            return overtimeHours * payRate * OVERTIME_MULTIPLIER;
        }
        return 0;
    }
}
