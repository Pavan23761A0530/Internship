import java.util.*;

public class SalaryCalculator {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Employee Name: ");
        String name = s.nextLine();
        System.out.print("Enter the basic Salary: ");
        int basicSalary = s.nextInt();
        System.out.print("Enter the bonus ");
        int bonus = s.nextInt();
        System.out.println("Enter the tax percent : ");
        int taxPercent = s.nextInt();
        int GrossSalary = basicSalary + bonus;
        double taxAmount = (GrossSalary * taxPercent) / 100.0;
        double NetSalary = GrossSalary - taxAmount;
        System.out.println("Gross Salary is : " + GrossSalary);
        System.out.println("Tax Amount is : " + taxAmount);
        System.out.println("Net Salary is : " + NetSalary);
        s.close();
    }
}


// PS D:\Internship\Basicjava> javac SalaryCalculator.java
// PS D:\Internship\Basicjava> java SalaryCalculator      
// Enter the Employee Name: Pavan
// Enter the basic Salary: 50000
// Enter the bonus 10000
// Enter the tax percent : 
// 10
// Gross Salary is : 60000
// Tax Amount is : 6000.0
// Net Salary is : 54000.0