package commonExamp;

public class UseofStaticNonStatic 
{
	public static void main(String[] args) 
	{
		EmpInfo E1=new EmpInfo();
		E1.EmpName="pranali";
		E1.EmpID=144;
		E1.EmpCEOName="abc";
		
		EmpInfo E2=new EmpInfo();
		E2.EmpName="Aayudh";
		E2.EmpID=14;
		E2.EmpCEOName="xyz";
		
		E1.showinfo();
		E2.showinfo();
		
		
	}

}
