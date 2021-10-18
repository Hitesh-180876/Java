import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t;
		t = s.nextInt();

		while(t>0){
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();

		int current = start;
		while(end>=current){
			int celsius = (int)((5.0/9)*(current-32));
			System.out.println(current+"\t"+celsius);
			current+=step;
		}
		t-=1;

		}
	}

}
