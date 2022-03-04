package general_utility_program;

import java.util.Scanner;

public class Palindrome_Integer_Check {
//what exactly are the palindrome? It's actually a number where even if you reverse it the value remains same e.g, 121 reverse 121
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//so we will reverse the no & store in another variable & compare
		int no;
		System.out.println("Enter your number : ");
		Scanner scan = new Scanner(System.in);
		no = scan.nextInt();
		
		int tmp=no; //original no store in tmp to compare with reverse no later
		
		int rev=0, rem;
		//below is logic to reverse a no take 121 for example
		while(no != 0) {		//1st iteration				//2nd iteration						//3rd iteration
			rem = no % 10;		//121%10=>1					//12%10=>2							//1%10=>1
			rev = rev*10+rem;	//0*10+1(rem=1)=>1			//(previous rev=1)1*10+2=>12		//12*10+1=>121
			no = no/10;		    //121/10=>12 no!=0 loop 	//12/10=>1 no!=0 loop				//1/10=>0.1 but since it it int no==0 loop terminates
		}
		
		if(tmp == rev)
			System.out.println("Congratz You Got a PalinDrome :)");
		else
			System.out.println("Ohh!!! No PalinDrome for you :(");
		
		scan.close();
	}

}
