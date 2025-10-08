import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
           
            System.out.print("Enter employee number: ");
            int employeeNumber = scanner.nextInt();

            System.out.print("How many hours did you work this week? ");
            double hoursWorked = scanner.nextDouble();

            System.out.print("What is your regular pay rate? ");
            double payRate = scanner.nextDouble();
            Employee employee = new Employee(employeeNumber, payRate);

            
            double regularPay = employee.calculateRegularPay(hoursWorked);
            double overtimePay = employee.calculateOvertimePay(hoursWorked);

           
            System.out.printf("Regular pay is %.1f\n", regularPay);
            System.out.printf("Overtime pay is %.1f\n", overtimePay);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input.");
        } finally {
            scanner.close();
        }
    }
}
