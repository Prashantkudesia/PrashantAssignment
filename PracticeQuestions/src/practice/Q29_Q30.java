package practice;


class parent1
{
	void run()
	{
		System.out.println("Running..........");
	}
}
class child11 extends parent
{
	
	void run()
	{
		super.run();
		
		System.out.println("Running Slowly..........");
	}
}

public class Q29_Q30 {

	public static void main(String[] args) {
		// Create a same methods in super class and subclass. subclass will inherit superclass . Now from main, create an object of a subclass and call that same method.
		child11 o=new child11();
		o.run();
	}

}
