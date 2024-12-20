package MyPackage;

import java.util.Scanner;

public class copyAlternateElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the size of the first array:");
        int sizeA = sc.nextInt();
        int[] a = new int[sizeA];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < sizeA; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("First array elements are:");
        for (int i = 0; i < sizeA; i++) {
            System.out.println("arr[" + i + "] = " + a[i]);
        }

        System.out.println("================================================");

      
        System.out.println("Enter the size of the second array:");
        int sizeB = sc.nextInt();
        int[] b = new int[sizeB];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < sizeB; i++) {
            b[i] = sc.nextInt();
        }


        System.out.println("Second array elements are:");
        for (int i = 0; i < sizeB; i++) {
            System.out.println("arr[" + i + "] = " + b[i]);
        }

        System.out.println("================================================");

      
        
        int newSize = (sizeA + sizeB + 1) / 2; 
        int[] c = new int[newSize];

       
        int j = 0;
        for (int i = 0; i < sizeA; i += 2) {
            c[j++] = a[i];
        }

       
        for (int i = 0; i < sizeB; i += 2) {
            c[j++] = b[i];
        }

      
        System.out.println("Final elements are:");
        for (int i = 0; i < j; i++) {
            System.out.println("c[" + i + "] = " + c[i]);
        }

        sc.close();
    }
}
