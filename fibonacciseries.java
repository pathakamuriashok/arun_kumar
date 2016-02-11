package Basic_programs;

public class fibonacciseries
{
		int a,b=0,c=1;
		public void fib()
		{
			int n=8;
			for(int i=1;i<n;i++)
			{
				a=b;
				b=c;
				c=a+b;
				System.out.print(c+" ,");
				
			}
		}
	public static void main(String[] args) 
	{
		fibonacciseries f=new fibonacciseries();
		    f.fib();
		   
	}
}
