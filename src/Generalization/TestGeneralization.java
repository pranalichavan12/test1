package Generalization;

public class TestGeneralization 
{
	public static void main(String[] args) 
	{
		System.out.println("---Features of jio Simcard---");
		Jio j=new Jio();
		j.sms();
		j.calling();
		j.data();
		j.newFeatureA();
		
		System.out.println("---Features of VI Simcard---");
		VI v=new VI();
		v.sms();
		v.calling();
		v.data();
		v.newFeatureB();
		
		System.out.println("---Features of Airtel Simcard---");
		Airtel A=new Airtel();
		A.sms();
		A.calling();
		A.data();
		A.newFeatureC();
	}
	

}
