package Basic_programs;

import java.util.Scanner;

public class Maximum_3
{
		int a,b,c;
		Scanner s=new Scanner(System.in);
	    public void muximum()
	    {
	    	System.out.println("enter three numbers ");
	    	System.out.println("enter first number");
	    	a=s.nextInt();
	    	System.out.println("enter second number");
	    	b=s.nextInt();
	    	System.out.println("enter Thired number");  
	    	c=s.nextInt();  
	    	System.out.println("given numbers are  "+a+" ,"+b+" ,"+c);  
	    	
	    	if(a>b&&b>c)
	    	{
	    		System.out.println("a is big"); 
	    	}
	    	else if(b>a&&a>c)
	    	{
	    		System.out.println("b is big");
	    	}
	    	else
	    	{
	    		System.out.println("c is big");
	    	}
	    }
	public static void main(String[] args) 
	{
          Maximum_3 m=new Maximum_3();
          m.muximum();
	}

}
