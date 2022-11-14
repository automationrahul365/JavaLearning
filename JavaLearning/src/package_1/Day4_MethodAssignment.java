package package_1;

public class Day4_MethodAssignment 
{

	public void Pmethod()
	{
		System.out.println("Parent Default Method");
	}
	public void Pmethod1(int a)
	{
		System.out.println("Parent one parameterized Method");
	}
	public void Pmethod2(int a, int b)
	{
	
		System.out.println("Parent two parameterized Method");
		
	}
	public void Pmethod3(int a, int b, int c)
	{
		System.out.println("Parent three parameterized Method");
		this.Pmethod();
		this.Pmethod1(1);
		this.Pmethod2(1, 3);
		
	
	}
}
