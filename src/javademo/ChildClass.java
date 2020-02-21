package javademo;

public class ChildClass extends ParentClass
{
	int x=352;
	int y;

	public static void main(String[] args) 
	{
		ChildClass cc=new ChildClass();
		cc.login(30);
		System.out.println("the value "+cc.x);
		cc.logout();
		
	}
	public ChildClass()
	{
		this(1);
		System.out.println("Constructor current value  ");
	}
	public ChildClass(int i) 
	{
		System.out.println("The value of x is djk "+ i);
		System.out.println("parameterise constructor");
	}
	public void login(int x)
	{
		this.x=x;
		System.out.println("the value of x is "+x);
		System.out.println("setup Program in child class");
	}
	public void logout()
	{
		System.out.println("Setup program in Child classsss ");
	}


}
