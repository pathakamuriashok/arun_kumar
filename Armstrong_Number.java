package Basic_programs;

import java.util.Scanner;

public class Armstrong_Number
{
		public int n,sum=0,temp,r;
		Scanner s=new Scanner(System.in);
	public void armstrong()
	{
		System.out.println("enter number for check it is armstron or not");  
		n=s.nextInt();
		temp=n;
		while(temp !=0)
		{
			r=temp;
			sum=sum+(r*r*r);
			temp=temp/10;
		}
		if(n==sum)
		{
			System.out.println("it is armstrong");
		}
		else
		{
			System.out.println("it is not armstrong ");
		}
	}
	public static void main(String[] args) 
	{
            Armstrong_Number a=new Armstrong_Number();
            a.armstrong();
	}

}
