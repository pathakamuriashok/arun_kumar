package Basic_programs;

import java.util.Scanner;

public class Rectangle
{
	Scanner s=new Scanner(System.in);
	public double area,perimetar;
	
	public void area()
	{
		System.out.println("entr lenght and breath ");
		int l=s.nextInt();
		int b=s.nextInt();
		area=l*b;
		System.out.println("area of rectangle is   "+area); 
	}
	public void perimetar()
	{
		System.out.println("entr lenght and breath ");
		int l=s.nextInt();
		int b=s.nextInt();
		perimetar=2*(l+b);
		System.out.println("perimetar of rectangle is   "+perimetar); 
	}
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		r.area();
		r.perimetar();
		
	}

}
