package test;

public class Vehicle {
	{
		{
			{
				System.out.println("Hi");
			}
		}
	}
	
	public Vehicle() {
		this(10);
		System.out.println("vehicle default constructor.");
	}
	
	
	{
		System.out.println("instance block is executing in here!");
	}
	
	public Vehicle(int x) {
		System.out.println("int type params constructor.");
	}
	
	public static void main(String[] args) {
		new Vehicle();
	}
	
}
