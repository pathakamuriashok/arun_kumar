package Basic_programs;

import java.util.Scanner;

public class Primenumbers
{
	public int n,c,m,count;
	Scanner s=new Scanner(System.in);
			public void prime1()
			{
				System.out.println("enter value for check it is prime or not");
				n=s.nextInt();
				m=n/2;
				for(int i=2;i<=m;i++)
				{
						if(n%i==0)
						{
							System.out.println("number is not prime");
							count++;							
							break;
						}
				}
						if(count==0)
						{
							System.out.println("number is prime");
						}
				
			}
			
			public boolean iprime(int x) 		
			{
				for(int i=2;i<=x/2;i++)
				{
					if(x%i==0)
					{
						return false;
					}
				}
				return true ; 
			
			}
	public static void main(String[] args) 
	{
			Primenumbers p=new Primenumbers();
			p.prime1();
			boolean a1=p.iprime(1);
			System.out.println(a1); 
			boolean a2=p.iprime(2);
			System.out.println(a2); 
			boolean a3=p.iprime(3);
			System.out.println(a3); 
			boolean a4=p.iprime(4);
			System.out.println(a4); 
			boolean a5=p.iprime(5);
			System.out.println(a5); 
			boolean a6=p.iprime(1);
			System.out.println(a6); 
			boolean a7=p.iprime(2);
			System.out.println(a7); 
			boolean a8=p.iprime(3);
			System.out.println(a8); 
			boolean a9=p.iprime(4);
			System.out.println(a9); 
			boolean a10=p.iprime(5);
			System.out.println(a10); 

	}
}