package Array;

public class Example3_Reverseorder 
{
	public static void main(String[] args) 
	{
		int [] ar1=new int[4];
		
		ar1[0]=30;
		ar1[1]=20;
		ar1[2]=20;
		ar1[3]=10;
		
		System.out.println("----Original data----");
		
		for(int i=0;i<=ar1.length-1;i++)
		{
			System.out.println(ar1[i]);
		}
		System.out.println("---print array in reverese order---");
		
		for(int i=ar1.length-1;i>=0;i--)
		{
			System.out.println(ar1[i]);
		}
	}

}
