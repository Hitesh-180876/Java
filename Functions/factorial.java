// jdoodle oneline java compiler

import java.util.Scanner;
public class MyClass {
    public static int factorial(int n){
        int i = 1;
        int fact = 1;
        while(i <= n){
            fact = fact*i;
            i+=1;
        }
        return fact;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int fact = factorial(N);
        System.out.println(fact);
    }
}
