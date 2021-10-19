import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();

		int i = 1;
		while(i<=N){
			int j = 1;
			while(j<=i){
				System.out.print(j);
				j+=1;
			}
			System.out.println();	
			i+=1;
		}

	}
}
