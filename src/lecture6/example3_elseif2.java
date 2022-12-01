package lecture6;

public class example3_elseif2 
{
	public static void main(String [] args)
	{
		int marks=22;
		//30>=65
		if(marks>=65)
		{
			System.out.println("Distinction");
		}
		//30>=60  & 60-64
		else if(marks>=60 & marks<=64)
		{
			System.out.println("first class");
			
		}
		//30>=50 & 55<=59
		else if(marks>=50 & marks<=59)
		{
			System.out.println("Second class");
		}
		//30>=35 & 40<=49
		else if(marks>=35 & marks<=49)
		{
			System.out.println("pass");
		
		}
		else
		{
			System.out.println("Fail");
		}
		
		
				
	}

}
