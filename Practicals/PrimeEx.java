package sample;
import java.util.Scanner;

public class PrimeEx {

	public static void main(String[] args) {
		int i ,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number:");
		//creating a variable using scanner class object
		int no = sc.nextInt();
			
        for(i=2;i<no; i++) 
        {
        	if(no%i==0)
        	{
        		count++;
        		break;
        	}
        }
        
        
        if(count==0) 
        
        	System.out.println("\nnumber is  prime");
        else
        	System.out.println("\nnumber is not prime");
        }

	}
