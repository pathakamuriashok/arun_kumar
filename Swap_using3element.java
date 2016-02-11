package Basic_programs;

import java.util.Scanner;

public class Swap_using3element 
{
	int a,b,c;
	Scanner s=new Scanner(System.in);
	public void swap()
	{
		System.out.println("enter values for swaping");  
		a=s.nextInt();
		b=s.nextInt();
		
		System.out.println("before swaping the numbers are "+"a="+a+" b="+b);  
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("after swaping the number are "+"a="+a+" b="+b);  
	}
	public static void main(String[] args) 
	{
			Swap_using3element s=new Swap_using3element();
			s.swap();
	}

}
