package lecture3;

public class sample1 
{
   //Non static method call from same class
	
	public static void main(String [] args)
	{
		System.out.println("hello Pranali");
		
		sample1 s1=new sample1();
		s1.m4();
		s1.m5();
		
	}
	public static void m4()
	{
		System.out.println("india is my country");
	}
	
	public static void m5()
	{
		System.out.println("proud to be I am Indian");
	}
	
	
}
