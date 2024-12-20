package MyPackage;

import java.util.Scanner;

public class StorePositiveNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for the first array size
        System.out.println("Enter the size of the first array:");
        int size1 = sc.nextInt();
        
        int[] a = new int[size1]; // Original array
        int[] b = new int[size1]; // Array to store positive numbers
        int j = 0; // Counter for positive numbers
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size1; i++) {
            a[i] = sc.nextInt();
            
            // Store positive numbers in array b
            if (a[i] > 0) {
                b[j] = a[i];
                j++;
            }
        }

        // Print the positive numbers stored in array b
        System.out.println("Positive numbers are:");
        for (int i = 0; i < j; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }

        sc.close(); // Close the scanner
    }
}
