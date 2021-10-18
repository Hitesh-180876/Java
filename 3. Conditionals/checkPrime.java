import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner s = new Scanner(System.in);
		int number;
		number = s.nextInt();
		boolean isPrime = true;

		int i = 2;
		while(i<number){
			if(number%i == 0){
				isPrime = false;	
			}
			i+=1;
		}

		if(isPrime){
			System.out.println(number+" is prime");
		}
		else{
			System.out.println(number+" is not prime");
		}
	}
}
