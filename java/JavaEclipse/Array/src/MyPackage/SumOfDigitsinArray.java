package MyPackage;
import java.util.Scanner;

public class SumOfDigitsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		
		 System.out.println("Enter the size of the first array:");
	        int size1 = sc.nextInt();
	        
	        int[] a = new int[size1]; 
	        int[] b = new int[size1]; 
	        int sum = 0,j=0; 
	        
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size1; i++) {
	            a[i] = sc.nextInt();
	            
	            while(a[i]>sum)
	            {
	            	
	            	sum=sum+ a[i]%10;
	            	a[i]=a[i]/10;
	            }
	            
	          b[j]=sum;
	          
	        }
	        
	        

	}

}
