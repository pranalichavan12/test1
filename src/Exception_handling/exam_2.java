package Exception_handling;

public class exam_2 
{
	public static void main(String[] args) 
	{
		String s1="abcd";
		try
		{
			System.out.println(s1.charAt(6));
		}
		catch(StringIndexOutOfBoundsException a)
		{
			System.out.println("StringIndexOutOfBounds Exception handled");
		}
		System.out.println("Hi");
		System.out.println("Hello");
		
	}

}
