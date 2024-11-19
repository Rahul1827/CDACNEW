package My_class_pac;

import java.util.Scanner;

public class Student {

    private int rollNo; 
    private String name;
    private double percentage;
    public static Scanner sc = new Scanner(System.in); 
    
   
    public void setData() {
        System.out.println("Enter the Roll Number:");
        rollNo = sc.nextInt();

        System.out.println("Enter the Name:");
        name = sc.next();

        System.out.println("Enter the Percentage:");
        percentage = sc.nextDouble();
    }
    
    public void showData() {
        System.out.println("Roll Number of the student is: " + rollNo);
        System.out.println("Name of the student is: " + name);
        System.out.println("Percentage of the student is: " + percentage);
    }
    
   
    public double getPercentage() {
        return percentage;
    }

   
    public static void top3(Student[] std, int nos) {
       
        for (int i = 0; i < nos - 1; i++) {
            for (int j = i + 1; j < nos; j++) {
                if (std[i].getPercentage() < std[j].getPercentage()) {
                   
                    Student temp = std[i];
                    std[i] = std[j];
                    std[j] = temp;
                }
            }
        }
        
        System.out.println("Top 3 Students are:");
        int count = 0;
        for (int i = 0; i < nos; i++) {
            if (count < 3) {
                std[i].showData();
                System.out.println();
                count++;
            } else {
                break; 
            }
        }
    }
}
