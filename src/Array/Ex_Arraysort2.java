package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex_Arraysort2 
{
	public static void main(String[] args) 
	{
		String [] ar=new String[5];
		ar[0]="pranali";
		ar[1]="pradnya";
		ar[2]="priyuanka";
		ar[3]="dhanu";
		ar[4]="aayuudh";
		
		System.out.println("---Original data----");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
			
		}
		Arrays.sort(ar);
		System.out.println("----After sorting----");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
