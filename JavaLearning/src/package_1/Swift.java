package package_1;

public class Swift 
{
	int swift;
	public void swiftMethod() {
		System.out.println("Swift Class Method");
	}
	public static void main(String[] args) {
		Swift sw = new Swift();
		sw.swiftMethod();
//		sw.marutiMethod();
		Maruti ma = new Maruti(); // has a relation
		ma.marutiMethod();
	}

}
