package sample;

import java.util.Scanner;//importing the packge to get the input from user to use the Scanner class

public class MultiplicationTable 
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);// Creating the object of scanner class
	System.out.println("Enter the number for table");
	int number=sc.nextInt();//accepting the number from user to print the table
	//Multiplying the number 10 times 
	for(int i=1;i<=10;i++)
	{
		System.out.println(i*number);
	}
	
}
}