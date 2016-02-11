package Basic_programs;

import java.util.Scanner;

public class Swa_without3variable 
{
		public void swap()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter two values"); 
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.println("Before swaping  "+"a="+a+" b="+b);
			
			 a=a+b;
			 b=a-b;
			 a=a-b;
			 System.out.println("After swaping  "+"a="+a+" b="+b);  
		}
	public static void main(String[] args) 
	{
			Swa_without3variable s=new Swa_without3variable();
			s.swap();
	}

}
