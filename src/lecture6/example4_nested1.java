package lecture6;

public class example4_nested1 
{
	public static void main(String[] args) 
	{
		int PEM=200;
		
		//200>=300
		if(PEM>=300)
		{
			System.out.println("Eligible for Mains Exam");
			
			int MEM=500;
			
			//500>=700
			
			if(MEM>=700)
			{
				System.out.println("Gotr Selected");
			}
			else
			{
				System.out.println("Rejected for Mains Exams");
			}
			
		}
		else
		{
			System.out.println("Not Eligible For Mains Exam");
		}
		
	}
}

		


