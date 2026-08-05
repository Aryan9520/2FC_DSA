package _1D_Array;

import java.util.Arrays;
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
        int max = marks[0];
        for (int i = 1; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("The maximum number is " + max);

        int min = marks[0];
        for (int i = 1; i > n; i++) {
            if (marks[i] > min) {
                min = marks[i];
            }
        }
        System.out.println("The minimum number is " + min);




    }
}