package Basicjava;

import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.nextLine();
        System.out.println("Enter Roll number");
        int roll_no = s.nextInt();
        s.nextLine();
        System.out.println("enter your college name");
        String college = s.nextLine();
        System.out.println("enter cgpa");
        Double cgpa = s.nextDouble();
        System.out.println(name);
        System.out.println(roll_no);
        System.out.println(college);
        System.out.println(cgpa);
        s.close();
    }
}