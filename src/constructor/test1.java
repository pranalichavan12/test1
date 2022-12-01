package constructor;

public class test1 
{
	int num1;
	int num2;
	
	test1(int a,int b)
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
		test1 t1=new test1(789,236);
		t1.addition();
		t1.mul();
		
		System.out.println("----------");
		
		test1 t2=new test1(45,56);
		t2.addition();
		t2.mul();
		
		
	}

}
