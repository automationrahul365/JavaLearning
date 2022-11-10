package package_1;

public class Day3_Assignment 
{
	public void method()
	{
		System.out.println("This is the default method");
	}
	public void method1()
	{
		System.out.println("This is the first method");
	}
	public void method2()
	{
		System.out.println("This is the second method");
	}
	public void method3()
	{
		System.out.println("This is the third method");
		this.method();
		this.method4();
		this.method1();
		this.method2();
	}
	public void method4()
	{
		System.out.println("This is the fourth method");
	}
	public static void main (String[] args)
	{
		Day3_Assignment ob = new Day3_Assignment();
		ob.method3();
	}
}
