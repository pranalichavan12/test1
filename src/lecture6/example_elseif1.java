package lecture6;

public class example_elseif1 
{
	public static void main(String [] args)
	{
		int marks=30;
		
		//30>=65
		if(marks>65)
		{
			System.out.println("Distinction");
		}
		//30>=60
		else if(marks>=60 & marks<=64)
		{
			System.out.println("first class");
		}
		else if(marks>=50 & marks<=59)
		{
			System.out.println("second class");
		}
		//30>=35 & 40<=49
		else if(marks>=35 & marks<=49)
		{
			System.out.println("pass");
		}
		//30<35
		else if(marks<35)
		{
			System.out.println("Fail");
		}
	}

}
