package practice;


class parent
{
	void run()
	{
		System.out.println("Running..........");
	}
}
class child extends parent
{
	void walk()
	{
		System.out.println("Walking..........");
	}
}
public class Q26 {

	public static void main(String[] args) {		
		// Create One Parent Class and One child class, Now inherit parent class into child class. From main method, call method of a superclass and subclass by using object of a subclass
			child c1=new child();
			c1.run();
			c1.walk();
	}

}
