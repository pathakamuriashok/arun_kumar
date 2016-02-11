package Basic_programs;

public class Peramid 
{
			public void method1()
			{
				for(int i=0;i<=10;i++)
				{
					for(int j=0;j<=i;j++)
					{
						System.out.print("*"+" "); 
					}
					System.out.println();
				}
			}
			public void method2()
			{
				for(int k=0;k<=10;k++)
				{
						for(int l=1;l<=4-k/2;l++) 
						{
							System.out.print("  ");
						}
								for(int m=0;m<k;m++)
								{
									System.out.print("  ");
									System.out.print("*"); 
									
								}
						System.out.println();
				}
			}
	public static void main(String[] args) 
	{
	    Peramid p=new Peramid();
	    p.method1();
	    p.method2();
	}

}
