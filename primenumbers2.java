package Basic_programs;

import java.util.Scanner;

public class primenumbers2 
{
	int count=0;
		Scanner s=new Scanner(System.in);
		public void prime(int c,int d)
		{
			for(int i=c;i<d;i++)
			{  
				    for(int j=2;j<i/2;j++)
				    {
				    	if(i%j==0)
				    	{
				    		count ++;
				    		System.out.println(i+"  it is NOT prime number");
				    	}
				    }
				    if(count!=0)
				    {
				    	System.out.println(i+"  it is prime");  
				    }
			}
		}
	public static void main(String[] args)
	{
	      primenumbers2 p=new primenumbers2();
	      Scanner s=new Scanner(System.in);
	      System.out.println("enter tow number between to test it is prime or not ");
	      int a=s.nextInt();
	      int b=s.nextInt();
	      p.prime(a,b);
	}

}
