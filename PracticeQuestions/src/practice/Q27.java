package practice;

class P1
{
	void run()
	{
		System.out.println("Running..........");
	}
}
class Child1 extends P1
{
	void walk()
	{
		System.out.println("Walking..........");
	}
}


public class Q27 {

	public static void main(String[] args) {
		// Create One Parent Class and One child class, Now inherit parent class into child class. From main method, call method of a superclass and subclass by using object of a Superclass**
		P1 a=new P1();
		a.run();
		// a.walk(); undefined for parent class
	}

}
