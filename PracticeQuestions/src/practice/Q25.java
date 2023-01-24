package practice;

interface vehicle
{
	void Brand();
}

class c1 implements vehicle
{
	public void Brand()
	{
		System.out.println("BMW");
		System.out.println("Audi");
		System.out.println("Honda");
	}
}
public class Q25 extends c1{

	public static void main(String[] args) {
		// Create an interface , and implements interface in to class(class1) and call class1 methods from main method
		
		c1 a=new c1();
		a.Brand();

	}

}
