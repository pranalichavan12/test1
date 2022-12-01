package Array;

//Example of String Array

public class Example1 
{
	public static void main(String[] args) 
	{
		//step 1 :Array Declaration
		
		String[] ar=new String[5];
		
		//step 2 :Array Initialization
		
		ar[0]="pranali";
		ar[1]="pradnya";
		ar[2]="priyanka";
		ar[3]="pratiksha";
		ar[4]="rutru";
		ar[5]="ABC";
		
		//step 3 :Array Usage
		
		System.out.println(ar[4]);
		System.out.println(ar.length);
		
		System.out.println("--print all info in array--");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		//for(int i=0;i<=4;i++)
		//{
			//System.out.println("ar[i]");	
		//}
		
		
		
	}

}
