package javademo;

import java.util.Scanner;

public class Methodes 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.println("enter x valu and y values");
		Scanner s=new Scanner(System.in);
		System.out.println("Adiition is"+ s);
		int x=s.nextInt();
		int y=s.nextInt();
		Methodes me= new Methodes();
		int a=me.add(x,y);
		System.out.println("the addition is"+ a);
		

	}

	public void add()
	{
	
		System.out.println(25+50);
	}
	public int add(int x,int y)
	{
		int z=x+y;
		return z;
	}
	
	
	public String add(int x,String y)
	{
		return y;
		
	}
}
