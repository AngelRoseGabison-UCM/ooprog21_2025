public class Employee {
    private int employeeNumber;
    private double payRate;

    
    public static final int MAX_EMPLOYEE_NUMBER = 9999;
    public static final double MAX_PAY_RATE = 60.00;
    public static final double OVERTIME_MULTIPLIER = 1.5;

    
    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber <= 0 || employeeNumber > MAX_EMPLOYEE_NUMBER) {
            throw new IllegalArgumentException("Employee number must be between 1 and " + MAX_EMPLOYEE_NUMBER);
        }
        if (payRate <= 0 || payRate > MAX_PAY_RATE) {
            throw new IllegalArgumentException("Pay rate must be between 0 and " + MAX_PAY_RATE);
        }
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

   
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
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
