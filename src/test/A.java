package test;

public class A {
	
	static {
		System.out.println("static block of class A");
	}

	public static void main(String[] args) {

		{
			System.out.println("instance block in the main method!");
		}

	}

	{
		System.out.println("instance block in class!");
	}
	
}

