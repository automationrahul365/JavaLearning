package package_1;

public class Day4_Assignment 
{
public Day4_Assignment()
	{	
		this(1,2,3);
		System.out.println("Parent Default constructor");
	}
public Day4_Assignment(int a)
	{
		this();
		System.out.println("Parent One parameterized constructor");
	}
public Day4_Assignment(int a, int b)
	{
		this(1);
		System.out.println("Parent Two parameterized constructor");
	}
public Day4_Assignment(int a, int b, int c)
	{
		
		System.out.println("Parent Three parameterized constructor");
	}
}
