package package_1;

public class Day4_MethodAssignment1 extends Day4_MethodAssignment
{

	public void method()
	{
		
		this.method1(1);
		this.method3(1, 2, 3);
		this.method2(1, 2);
		System.out.println("Child Default Method");
		
	}
	public void method1(int a)
	{
		super.Pmethod3(1, 2, 3);
		System.out.println("Child one parameterized Method");
		
		
	}
	public void method2(int a, int b)
	{
		System.out.println("Child two parameterized Method");
	}
	public void method3(int a, int b, int c)
	{
		System.out.println("Child three parameterized Method");
	}
	public static void main(String[] args) 
	{
		Day4_MethodAssignment1 ob = new Day4_MethodAssignment1();
		ob.method();
		

	}

}
