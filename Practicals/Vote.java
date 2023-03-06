package sample;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age");
		int a=sc.nextInt();
     if(a>=18)
     {
    	System.out.println("Congratulations You are eligible for Voting"); 
     }
     else
     {
     	System.out.println("Sorry! You are not eligible for Voting"); 

     }

	}

}
