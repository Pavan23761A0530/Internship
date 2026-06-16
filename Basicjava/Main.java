package Basicjava;

import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.nextLine();
        // System.out.println(name);
        System.out.println("Enter Maths marks");
        int maths = s.nextInt();
        System.out.println("enter Science marks");
        int science = s.nextInt();
        System.out.println("enter english marks");
        int english = s.nextInt();
        System.out.println("enter java marks");
        int java = s.nextInt();
        System.out.println("enter SQL marks");
        int sql = s.nextInt();
        int total = maths + science + english + java + sql;
        Double Average = total / 5.0;
        Double percentage = (total / 150.0) / 100;

        if (percentage >= 80) {
            System.out.println("Eligible for scholorship");
        } else {
            System.out.println("Not Eligible for scholorship");
        }
        System.out.println("Name is: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + Average);
        System.out.println("Percentage: " + percentage);
        if (total >= 100) {
            System.out.println("Grade is A");
        } else if (total < 100 && total >= 90) {
            System.out.println("Grade is B");
        } else if (total < 90 && total >= 80) {
            System.out.println("Grade is C");
        } else if (total < 80 && total >= 70) {
            System.out.println("Grade is D");
        } else {
            System.out.println("Fail");
        }
        s.close();
    }

}
