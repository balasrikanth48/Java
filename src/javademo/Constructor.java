package javademo;

public class Constructor 
{
     static int x=10;
      static int y=20;
	public static void main(String[] args)
	{
		Constructor con= new Constructor(20, 30);
		System.out.println("the message"+ con);
		System.out.println("the first num"+" "+ x);
		

	}

	public Constructor()
	{
		System.out.println("method of constructor");
	}
	public Constructor(int x,int y)
	{
		System.out.println("the two numbers is");
	}
}
