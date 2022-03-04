package general_utility_program;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Number to Find Even or Odd : ");
		int number = scan.nextInt();
		
		if(number % 2 == 0) //number module 2 or remainder of even no will always be zero
			System.out.println("Number is Even.");
		else
			System.out.println("It's Odd ;)");
		
		scan.close();
	}

}
