package in.leetcode;

import java.util.Scanner;

public class MergeArrays {

    public void merge(int[] num1, int m, int[] num2, int n) {
        int p1 = m - 1; // Pointer for the end of initialized part of num1
        int p2 = n - 1; // Pointer for the end of num2
        int p3 = m + n - 1; // Pointer for the end of num1 array

        // Merge in reverse order
        while (p1 >= 0 && p2 >= 0) {
            if (num1[p1] > num2[p2]) {
                num1[p3] = num1[p1];
                p1--;
            } else {
                num1[p3] = num2[p2];
                p2--;
            }
            p3--;
        }

        // If there are remaining elements in num2
        while (p2 >= 0) {
            num1[p3] = num2[p2];
            p2--;
            p3--;
        }

        // No need to handle remaining elements in num1 since they're already in place
    }

    public static void main(String[] args) {
        MergeArrays mergeArrays = new MergeArrays();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of initialized elements in the first array: ");
        int m = sc.nextInt();

        System.out.println("Enter size of the second array: ");
        int n = sc.nextInt();

        int[] num1 = new int[m + n]; // Initialize num1 with sufficient size
        System.out.println("Enter the initialized elements in the first array: ");
        for (int i = 0; i < m; i++) {
            num1[i] = sc.nextInt();
        }

        int[] num2 = new int[n];
        System.out.println("Enter elements in the second array: ");
        for (int i = 0; i < n; i++) {
            num2[i] = sc.nextInt();
        }

        mergeArrays.merge(num1, m, num2, n);

        System.out.println("Merged array: ");
        for (int i = 0; i < m + n; i++) {
            System.out.print(num1[i] + " ");
        }
    }
}
