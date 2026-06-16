package Basicjava;

import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int roll_no = s.nextInt();
        s.nextLine();
        String college = s.nextLine();
        Double cgpa = s.nextDouble();
        System.out.println(name);
        System.out.println(roll_no);
        System.out.println(college);
        System.out.println(cgpa);
        s.close();
    }
}