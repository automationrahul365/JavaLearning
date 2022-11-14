package package_1;

import java.util.Scanner;

public class Day5_ScannerClass 
{
	int x1, x2, x3, x4, x5, x6;
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int c, int d) {
		return c-d;
	}
	public int mult(int e, int f) {
		return e*f;
	}
	public int div(int g, int h) {
		return g/h;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the value of X1");
		int x1=scan.nextInt();
		System.out.println("Please enter the value of X2");
		int x2=scan.nextInt();
		System.out.println("Please enter the value of X3");
		int x3=scan.nextInt();
		System.out.println("Please enter the value of X4");
		int x4=scan.nextInt();
		System.out.println("Please enter the value of X5");
		int x5=scan.nextInt();
		System.out.println("Please enter the value of X6");
		int x6=scan.nextInt();
		Day5_ScannerClass ob1 = new Day5_ScannerClass();
		int sum = ob1.add(x1, x2);
		int sum1=ob1.add(sum, x3);
		int sum2=ob1.sub(sum1, x4);
		int sum3=ob1.mult(sum2, x5);
		int result=ob1.div(sum3, x6);
		System.out.println("Result is "+result);
	}
	
	
}
