package Basic_programs;

import java.util.Scanner;

public class Circle
{
	public double r,pi=3.14,area,perimetar;
	Scanner s=new Scanner(System.in);
		public void area()
		{
			System.out.println("enter radious for find area of circle" );
			r=s.nextInt();
			area=pi*r*r;
			System.out.println("area of circle is  "+area); 
		}
		public void parimetar()
		{
			System.out.println("enter radious for find perimetar of circle" );
			r=s.nextInt();
			perimetar=2*pi*r;
			System.out.println("perimetar of circle is  "+perimetar); 
		}
	public static void main(String[] args) 
	{
	  Circle c=new Circle();
	  c.area();
	  c.parimetar();
	}

}
