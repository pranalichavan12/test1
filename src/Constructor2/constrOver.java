package Constructor2;

public class constrOver 
{
	//Constructor Overloading
	int num1;
	int num2;
	String name;
	
	//constructor without parameter
	constrOver()
	{
		num1=50;
		num2=60;
	}
	constrOver(int a,int b)
	{
		num1=a;
		num2=b;
	}
	constrOver(String S1)
	{
		name=S1;
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void StudentName()
	{
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		constrOver C1=new constrOver();
		C1.add();
		
		System.out.println("--------");
		
		constrOver C2=new constrOver(78,52);
		C2.add();
		
		System.out.println("--------");
		
		constrOver C3=new constrOver("Pranali");
		C3.StudentName();
	}

}
