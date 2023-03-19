package sample;

import java.util.Scanner;

public class ReverseNoEx {
	public static void main(String[] args) {
		int i ,rem=0,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number:");
		//creating a variable using scanner class object
		int no = sc.nextInt();
        
		while(no!=0) {
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			
			
		}
		System.out.println("reverse Number: "+rev);
}
}
