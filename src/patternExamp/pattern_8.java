package patternExamp;

public class pattern_8 
{
	public static void main(String[] args) 
	{
		//*
		//***
		//*****
		//*******
		//********
		
		int star=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.println("*");
			}
			System.out.println();
			star=star+2;
		}
		
	}

}
