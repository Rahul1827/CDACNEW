package MyPackage;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int size;
		System.out.println("Enter the size of the array");
		size=sc.nextInt();
		
		System.out.println("Enter the elements");
		int arr[];
		arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("array elements are:");
		for(int i=0;i<size;i++)
		{
			System.out.println("arr["+i +"]="+arr[i]);
		}
	

	}

}
