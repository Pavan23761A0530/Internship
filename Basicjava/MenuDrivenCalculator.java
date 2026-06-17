import java.util.*;

public class MenuDrivenCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Menu Driven Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        if (choice >= 1 && choice <= 5) {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            switch (choice) {
                case 1:
                    System.out.println("Result =" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result =" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result =" + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0)
                        System.out.println("Result =" + (num1 / num2));
                    else
                        System.out.println("cant divisible by zero");
                    break;
                case 5:
                    System.out.println("Result =" + (num1 % num2));
                    break;
            }
        } else if (choice == 6) {
            System.out.println("Exit");
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}