
import java.util.*;

public class ElectricityBill {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Consumer Name: ");
        String consumerName = s.nextLine();
        System.out.print("Enter units consumed: ");
        int units = s.nextInt();
        double bill;
        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
        } else if (units <= 300) {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 9);
        } else {
            bill = (100 * 5) + (100 * 7) + (100 * 9) + ((units - 300) * 12);
        }
        System.out.println("Custmer Name: " + consumerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Electricity Bill: " + bill);
        s.close();
    }
}

// PS D:\Internship\Basicjava> javac ElectricityBill.java
// PS D:\Internship\Basicjava> java ElectricityBill      
// Enter the Consumer Name: pavan
// Enter units consumed: 250
// Custmer Name: pavan
// Units Consumed: 250
// Electricity Bill: 1650.0
