package practice;

abstract class name
{
	abstract void draw();
}
public class Q31 extends name{

	void draw()
	{
		System.out.println("Drawing....");
		System.out.println("Playing....");
		
	}
	public static void main(String[] args) {
		// Create a abstract class with methods and try to access abstract method from main
		
		Q31 obj=new Q31();
		obj.draw();

	}

}
