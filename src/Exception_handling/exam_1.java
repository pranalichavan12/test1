package Exception_handling;

public class exam_1 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[4];     //0 to 3
		try
		{
			ar[1]=10;
		}
		catch(ArrayIndexOutOfBoundsException  handled)
		{
			System.out.println("ArrayIndexOutOfBoundsException  handled");
		}
		System.out.println("Hi");
		System.out.println("Hello");
		
	}

}
