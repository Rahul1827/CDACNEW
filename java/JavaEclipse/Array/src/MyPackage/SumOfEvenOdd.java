

package MyPackage;
import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int size;
		int sum=0, even=0,odd=0;
		System.out.println("Enter the size of the array");
		size=sc.nextInt();
		
		System.out.println("Enter the elements");
		int arr[];
		arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
			
		
		System.out.println("array elements are:");
		for( i=0;i<size;i++)
		{
			sum=sum+arr[i];
			System.out.println("arr["+i +"]="+arr[i]);
		}
		if(arr[i]%2==0)
		{
			
			even=even+arr[i];
		}
		
		else
		{
		odd=odd+arr[i];
	}
		
       System.out.println("Sum of the array is ="+sum);
       System.out.println("Even sum is ="+even);
       System.out.println("Even sum is ="+odd);
	}

}
}
