package practice;

interface i1
{
	void eat();
}
interface i2
{
	void sleep();
}
class c implements i1,i2
{
	public void eat()
	{
		System.out.println("Eating.....");
	}
	public void sleep()
	{
		System.out.println("Sleeping.....");
	}
}

public class Q28 {

	public static void main(String[] args) {
		// Create multiple(2 or 3) interface and implments interfaces into one class and call class1 methods from main method
			c obj=new c();
			obj.eat();
			obj.sleep();
	}

}
