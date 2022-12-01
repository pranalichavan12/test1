package Exception_handling;

public class Exam_6 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[4];
		try
		{
			ar[7]=10;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException handled");
		}
		catch(StringIndexOutOfBoundsException a)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		catch(Exception e)
		{
			System.out.println("Hi");
			System.out.println("Hello");
			
		}
		
	}

}
