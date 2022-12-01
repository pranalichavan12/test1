package constructor;

public class example1 
{
	int num1;
	int num2;
	
	example1(int a, int b)
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
		System.out.println(num1*num2);
	}
	public static void main()
	{
		example1 e1=new example1(69,52);
		e1.add();
		e1.sub();
		
		System.out.println("------");
		
		example1 e2=new example1(78,54);
		e2.add();
		e2.sub();
	}

}
