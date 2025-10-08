import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double payRate = scanner.nextDouble();

        Employee employee = new Employee(1, payRate);

        double regularPay = employee.calculateRegularPay(hoursWorked);
        double overtimePay = employee.calculateOvertimePay(hoursWorked);

        System.out.printf("Regular pay is %.1f\n", regularPay);
        System.out.printf("Overtime pay is %.1f\n", overtimePay);  
    }
}
