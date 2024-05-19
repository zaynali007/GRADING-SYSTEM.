package com.example;

import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student's name:");
        String name = scanner.nextLine();

        System.out.println("Enter number of subjects:");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            marks[i] = scanner.nextInt();
        }
        scanner.close();

        int totalMarks = calculateTotal(marks);
        double averageMarks = calculateAverage(totalMarks, numSubjects);
        String grade = determineGrade(averageMarks);

        System.out.println("Student: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
    }

    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public static double calculateAverage(int total, int numSubjects) {
        return (double) total / numSubjects;
    }

    public static String determineGrade(double averageMarks) {
        if (averageMarks >= 90) {
            return "A";
        } else if (averageMarks >= 80) {
            return "B";
        } else if (averageMarks >= 70) {
            return "C";
        } else if (averageMarks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
