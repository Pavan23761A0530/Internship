import java.util.*;

public class ResultCalculator {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Student Name: ");
        String name = s.nextLine();
        System.out.print("Enter the Student ID: ");
        int id = s.nextInt();
        System.out.print("Enter the Maths Marks: ");
        int maths = s.nextInt();
        System.out.print("Enter the Science Marks: ");
        int science = s.nextInt();
        System.out.print("Enter the English Marks: ");
        int english = s.nextInt();
        System.out.print("Enter the Java Marks: ");
        int java = s.nextInt();
        System.out.print("Enter the SQL Marks: ");
        int sql = s.nextInt();
        System.out.print("Enter the Student Attendance: ");
        double attendance = s.nextDouble();
        int total = maths + science + english + java + sql;
        double Average = total / 5.0;
        double percentage = (total / 500.0) * 100;

        if (percentage >= 90) {
            System.out.println("Grade is A+");
        } else if (percentage >= 80 && percentage < 89) {
            System.out.println("Grade is A");
        } else if (percentage >= 70 && percentage < 79) {
            System.out.println("Grade is B");
        } else if (percentage >= 60 && percentage < 69) {
            System.out.println("Grade is C");
        } else if (percentage >= 40 && percentage < 59) {
            System.out.println("Grade is D");
        } else {
            System.out.println("Grade is F");
        }

        if (percentage >= 85 || attendance >= 80) {
            System.out.println("Eligible for Scholarship");
        } else {
            System.out.println("Not Eligible for Scholarship");
        }

        s.close();
    }
}

// PS D:\Internship\Basicjava> javac ResultCalculator.java
// PS D:\Internship\Basicjava> java ResultCalculator
// Enter the Student Name: Pavan
// Enter the Student ID: 30
// Enter the Maths Marks: 90
// Enter the Science Marks: 98
// Enter the English Marks: 97
// Enter the Java Marks: 96
// Enter the SQL Marks: 95
// Enter the Student Attendance: 86
// Grade is A+
// Eligible for Scholarship