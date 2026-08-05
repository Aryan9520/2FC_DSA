package _1D_Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter the marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        // Maximum
        int max = marks[0];
        for (int i = 1; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }

        // Minimum
        int min = marks[0];
        for (int i = 1; i < n; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }

        // Sum
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }

        // Average
        double average = 1.0* sum / n;

        System.out.println("Maximum marks = " + max);
        System.out.println("Minimum marks = " + min);
        System.out.println("Sum of marks = " + sum);
        System.out.println("Average marks = " + average);

        sc.close();
    }
}