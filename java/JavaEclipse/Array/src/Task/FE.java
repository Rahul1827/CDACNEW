package Task;

public class FE {
	private
	
	String name;
	int roll_no;
	float eng;
	float hindi;
	float maths;
	protected float total;
	
	
	void GetDetail(String na, int rno, float e, float h,float m)
	{
		
		name=na;
		roll_no=rno;
		eng=e;
		hindi=h;
		maths=m;
		total=eng+hindi+maths;
		
		
		
		
		
	}
	
	
	
	
void Show ()

{
	
System.out.println("Name of Student"+name);
System.out.println("Roll Number of a Student"+roll_no);
System.out.println("English Marks"+eng);
System.out.println("Hindi Marks"+hindi);
System.out.println("Maths Marks"+maths);
System.out.println("Total Marks is ="+total);
}
}
