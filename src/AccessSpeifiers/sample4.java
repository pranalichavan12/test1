package AccessSpeifiers;

public class sample4 
{
	protected int num;
	
	protected sample4()
	{
		num=10;
	}
	protected void name()
	{
		System.out.println(num);
	}
	public static void main(String[] args) 
	{
		sample4 s4=new sample4();
		s4.name();
		System.out.println(s4.num);
		
	}

}
