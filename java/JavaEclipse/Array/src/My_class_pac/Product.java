package My_class_pac;
import java.util.Scanner;

public class Product {
	
	private
    String	ProductName;
	float Rate,amount;
	int quantity;
	
	
	public
	
	 Product()
	{
		ProductName= "pendrive";
		Rate=500f;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the quantity");
		quantity=sc.nextInt();
		
		amount=Rate*quantity;
		
		
		
		
	}
	void Get ()
	{
		
	}
	
	void show()

	{
		System.out.println("Product Name = " +ProductName);
		System.out.println("Rate = " +Rate);
		System.out.println("quantity = " +quantity);
		System.out.println("Amountt = " +amount);
	}

}
