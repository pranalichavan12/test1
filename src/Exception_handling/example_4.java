package Exception_handling;

public class example_4 
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
			System.out.println("StringIndexOutOfBounds Exception handled");
			
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		System.out.println("Hi");
		System.out.println("Hello");
		
	}

}
