package general_utility_program;

public class FibonacciSeries {
//what actually is fibonacci series, it's actually the sum of previous 2 numbers
	// 0, 1, 1, 2, 3, 5, 8, 13 ... 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0, second=1; //1st two numbers are set in stone they will never change
		System.out.print(first +" "+ second);
		
		int sum;
		for(int i=0; i<10; i++) { //for loop to print series till 10 
			
			sum = first + second; //here we calculate sum of previous 2 no.s & assigned it to sum
			System.out.print(" "+ sum); //printing the value of sum
			
			//now we got summation with 2 previous no but we have to print this series till 10
			//simply swap/move the no.s back
			first = second; //here 1st no will become the second
			second = sum; // & second no will become the third
			//that way when loop goes back to calculate 4th index of series
			//the no will be like first=1 & second=1 that way sum=2 for 4th index
		}
	}

}
