/*
1
2 3
3 4 5
4 5 6 7

*/

// Interviewbit online compiler

import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int p =1;

		int i = 1;
		while(i<=N){
			p = i;
			int j = 1;
			while(j<=i){
				System.out.print(p);
				j+=1;
				p+=1;
			}
			System.out.println();
			i+=1;
		}
	}
}
