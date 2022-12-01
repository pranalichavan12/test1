package AccessSpeifiers;

public class sample1 
{
	//Example of Default Access specf
	
	public int num;
	public sample1()
	{
		num=90;
	}
	public void m1()
	{
		System.out.println(num);
	}
	public static void main(String[] args) 
	{
		sample1 s1=new sample1();
		s1.m1();
		System.out.println(s1.num);
		
	}

}
