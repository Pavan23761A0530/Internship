import java.util.*;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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


// PS D:\Internship\Basicjava> javac MenuDrivenCalculator.java
// PS D:\Internship\Basicjava> java MenuDrivenCalculator      
// Menu Driven Calculator
// 1. Addition
// 2. Subtraction
// 3. Multiplication
// 4. Division
// 5. Modulus
// 6. Exit
// Enter your choice: 1
// Enter first number: 20000
// Enter second number: 500
// Result =20500.0
// PS D:\Internship\Basicjava> 
// PS D:\Internship\Basicjava> javac MenuDrivenCalculator.java
// PS D:\Internship\Basicjava> java MenuDrivenCalculator      
// Menu Driven Calculator
// 1. Addition
// 2. Subtraction
// 3. Multiplication
// 4. Division
// 5. Modulus
// 6. Exit
// Enter your choice: 2
// Enter first number: 20000
// Enter second number: 700 
// Result =19300.0