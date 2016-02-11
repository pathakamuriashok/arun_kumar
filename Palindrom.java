package Basic_programs;

import java.util.Scanner;

public class Palindrom
{
		int sum=0,r,i;
		String str;
		Scanner s=new Scanner(System.in);
	public void palin()
	{
				
			System.out.println("enter value ");
			int n=s.nextInt();
				int a=n;
			while(n>0)
			{
				r=n%10;
				sum=sum*10+r;
				n=n/10;
			}
			System.out.println(sum); 
			if(sum==a)
			{
				System.out.println("it is palindrom");
			}
			else
			{
				System.out.println("it is not palindrom");
			}
	}
	public void paly_string()
	{
			System.out.println("enter string value");
			str=s.next();
			String str1=str;
			char []c=str.toCharArray();
				for(i=c.length-1;i>=0;i--)
				{
				  System.out.println(c[i]);   
             	}
	}					
	public static void main(String[] args) 
	{
       Palindrom p=new Palindrom();
       p.palin();
       p.paly_string();
	}
}