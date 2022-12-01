package Exception_handling;

public class exam_3 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		
		int div=0;
		try
		{
			div=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException handled");
		}
		System.out.println(div);
		System.out.println("GM");
		
	}

}
