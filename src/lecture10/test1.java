package lecture10;

public class test1 
{
	//example User defined constructor
	//constructor without or zero parameter
	//step1 declaration
	
	int num1;
	int num2;
	
	//step2 initialization
	
	test1()     //without or zero parameter
	{
		num1=10;
		num2=58;
	}
	//step3 usage
	public void addition()
	{
		System.out.println(num1+num2);
	}
	public void multi()
	{
		System.out.println(num1*num2);
	}
	public static void main(String[] args) 
	{
		test1 t1=new test1();
		t1.addition();
		t1.multi();
		
		System.out.println("-----------");
		
		test2 t2=new test2();
		t2.sub();
		
		
	}

}
