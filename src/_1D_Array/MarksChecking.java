package _1D_Array;

import java.util.Scanner;

public class MarksChecking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.print("Enter the marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();

            if (marks[i] == 100) {
                System.out.println("Congurations");
            } else if (marks[i] < 100) {
                System.out.println("Sorry");
            }
        }
    }
}

