package Basic_programs;

import java.util.Scanner;

public class Factorial 
{
			public int n,fact=1;
			Scanner s=new Scanner(System.in);
			public void factorial()
			{
				System.out.println("enter number");  
				n=s.nextInt();
				while(n>0)
				{
					fact=fact*n;
					n--;
				}
				System.out.println(fact);  
				
				for(int i=1;i<n;i++)
				{
					fact=fact*n;
				}
				System.out.println(fact);  
			}
	public static void main(String[] args)
	{
	     Factorial f=new Factorial();
	     f.factorial();
	}

}
