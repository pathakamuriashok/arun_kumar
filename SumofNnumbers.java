package Basic_programs;

import java.util.Scanner;

public class SumofNnumbers 
{
	public int n,sum=0;
	Scanner s=new Scanner(System.in);
			public void sum()
			{
				System.out.println("enter how may number you want to enter"); 
				n=s.nextInt();
				for(int i=0;i<=n;i++)
				{
					sum=sum+i;
				}
				System.out.println("sum of "+n+"is= "+sum);
			}
	public static void main(String[] args) 
	{
	   SumofNnumbers s=new SumofNnumbers();
	   s.sum();
	}

}
