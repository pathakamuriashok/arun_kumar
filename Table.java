package Basic_programs;

public class Table
{
		
	public void table()
	{
		for(int i=1;i<=20;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+(i*j));
     		}
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");   
		}
	}
	public static void main(String[] args) 
	{
	      Table t=new Table();
	      t.table();
	}

}
