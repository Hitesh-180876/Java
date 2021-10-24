//jdoodle online java compiler

import java.util.Scanner;

public class MyClass {
    
    public static boolean checkPrime(int N){
        int div = 2;
        while(div<=N/2){
            if(N%div == 0){
                return false;
            }
            div+=1;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        boolean result = checkPrime(N);
        System.out.println(result);
    }
}
