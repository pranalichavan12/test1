package Constructor2;

public class sample1 
{
	int num1;
	int num2;
	
	//user defined with 2 int parameter constructor
	
	sample1(int a, int b)
	{
		num1=a;
		num2=b;
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void sub()
	{
		System.out.println(num1-num2);		
	}
	public void mul()
	{
		System.out.println(num1*num2);
	}
	public static void main(String[] args) 
	{
	   sample1 S1=new sample1(78,55);
	   S1.add();
	   S1.mul();
	   S1.sub();
	   
	   sample2 s2=new sample2(52,24);
	   s2.div();
	}

}
