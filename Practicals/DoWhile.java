package Programs;
import java.util.Scanner;

public class DoWhile 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		do 
		{
			System.out.println("Enter a possitive number");
			n=sc.nextInt();
		}while(n<=0);
			int fact=1;
		    for(int i=1; i<=n; i++)
		    {
		    	fact *=i;
		    }
		    System.out.println(n+"!="+fact);
		
	}

}