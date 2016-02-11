package Basic_programs;

public class Generate_5Integers 
{

	public void integer()
	{
		for(int j=0;j<=5;j++)
		{
			System.out.println("at "+j+" level ");
			System.out.println();
		for(int i=0;i<5;i++)
		{
			int a=(int)((Math.random())*100);
//			System.out.println((int)((Math.random())*100));
			System.out.println("Inter "+i+" is "+"-->"+a);
 		}
	}
	}
	public static void main(String[] args)
	{
				Generate_5Integers g=new Generate_5Integers();
				g.integer();
	}

}
