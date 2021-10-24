// jdoodle online java compiler
import java.util.Scanner;
public class MyClass {
    
    public static int reverseNumber(int N){
        int ans = 0;
        while(N>0){
            ans = ans*10+N%10;
            N=N/10;
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int result = reverseNumber(n);
        System.out.println(result);
    }
}
