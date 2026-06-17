
import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("FOOD MENU Bro");
        System.out.println("1. shawarma  - 200");
        System.out.println("2. fried rice  - 100");
        System.out.println("3. samosa - 80");
        System.out.println("4. biryani - 250");
        System.out.println("5. exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        int quantity;
        double amount = 0;
        if (choice >= 1 && choice <= 4) {
            System.out.print("Enter Quantity: ");
            quantity = sc.nextInt();
            switch (choice) {
                case 1:
                    amount = quantity * 200;
                    System.out.println("You ordered shawarma");
                    break;
                case 2:
                    amount = quantity * 100;
                    System.out.println("You ordered fried rice");
                    break;
                case 3:
                    amount = quantity * 80;
                    System.out.println("You ordered samosa");
                    break;
                case 4:
                    amount = quantity * 250;
                    System.out.println("You ordered biryani");
                    break;
            }
            System.out.println("your total Bill =" + amount);
            System.out.println("\npayment menu");
            System.out.println("1.Cash");
            System.out.println("2.phonepay");
            System.out.println("3.Card");
            System.out.print("enter number: ");
            int payment = sc.nextInt();
            switch (payment) {
                case 1:
                    System.out.println("Paid Cash");
                    break;
                case 2:
                    System.out.println("Paid phonepay");
                    break;
                case 3:
                    System.out.println("Paid Card");
                    break;
                default:
                    System.out.println("Invalid");
            }
            System.out.println("Order booked successfully");
        } else if (choice == 5) {
            System.out.println("Exit");
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}

// PS D:\Internship\Basicjava> javac FoodOrder.java                                                    
// PS D:\Internship\Basicjava> java FoodOrder      
// FOOD MENU Bro
// 1. shawarma  - 200
// 2. fried rice  - 100
// 3. samosa - 80
// 4. biryani - 250
// 5. exit
// Enter your choice: 1
// Enter Quantity: 3
// You ordered shawarma
// your total Bill =600.0

// payment menu
// 1.Cash
// 2.phonepay
// 3.Card
// enter number: 2
// Paid phonepay
// Order booked successfully