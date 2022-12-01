package TypesofVariable;

public class nonstaticexamp 
{
	//Example Non static global variable
	
	int c=50;  //non static Global Variable
	
	public static void main(String[] args) 
	{
		//Non static global variable call from same class
		nonstaticexamp s12=new nonstaticexamp();  //create object of same class
		
		System.out.println(s12.c);
		
		System.out.println("-------");
		
		sample33 s33=new sample33();
		
		//crete obj of diff class
		System.out.println(s33.d);
		
	}
	   public static void m1()
	   {
		   nonstaticexamp s4=new nonstaticexamp();
		   System.out.println(s4.c);
	   }
	   public void m2()

	   {
		   System.out.println(c);
		   
	   }
	

}
