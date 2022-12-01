package constructor;

public class sample22 
{
	int num1;
	int num2;
	
	sample22(int a,int b)
	{
		
	num1=a;
	num2=b;
	
	}
public void addition()
{
		System.out.println(num1+num2);
		
}
		public void mul()
	{
		System.out.println(num1*num2);
	}
	    public static void main(String[] args) 
	{
		sample22 s22=new sample22(85,58);
		s22.addition();
		s22.mul();	
	}

}
