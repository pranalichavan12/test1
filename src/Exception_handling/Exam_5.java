package Exception_handling;

public class Exam_5 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[4];
		try
		{
			ar[7]=10;
			
		}
		catch(Exception a)
		{
			a.printStackTrace();
			System.out.println("Generic Exception handled");
		}
		System.out.println("Hi");
		System.out.println("Hello");
		
	}

}
