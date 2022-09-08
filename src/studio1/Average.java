package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Value for n1?");
		int n1 = in.nextInt(); // n1 is the first of two variables that need to be averaged
		System.out.println("Value for n2?"); 
		int n2 = in.nextInt(); // n2 is the second of two variable that need to be averaged
		System.out.print("The average of " + n1 + " and " + n2 + " is: ");
		System.out.println((n1 + n2) / 2.0);
		
		
	}

}
