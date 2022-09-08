package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("enter a year");
		int year = in.nextInt();
		boolean divisibleByFour = (year%4)==0; 
		boolean divisibleByHundred = (year%100)!=0; 
		boolean divisibleByFourHundred = (year%400)==0;
		
		boolean LeapYear = divisibleByFour && divisibleByHundred || divisibleByFourHundred;
		
		System.out.print("is " + year + " a leap year? ");
		System.out.println(LeapYear);
		
		
	}

}
