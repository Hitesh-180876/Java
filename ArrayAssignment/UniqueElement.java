/* jdoodle online java compiler
Time complexity of this approach is O(N^2)
*/

import java.util.Scanner;

public class MyClass {
    public static int uniqueElement(int[] arr){
        int N = arr.length;
        for(int i=0; i<N; i++){
            int j;
            for(j=0; j<N; j++){
                if(i != j){
                    if(arr[i] == arr[j]){
                        break;
                    }
                }
            }
            if(j == arr.length){
                return arr[i];
            }
        }
        return Integer.MIN_VALUE;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N;
        N = s.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = s.nextInt();
        }
        int unique = uniqueElement(arr);
        System.out.println(unique);
    }
}


/*
Time complexity of this approach is O(N)
*/
public class MyClass {
    public static int duplicate(int[] arr){
        int N = arr.length;
        int ans = 0;
        for(int i=0; i<N; i++){
            ans = ans^arr[i];
        }
        return ans;
    }
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 4, 1, 2};
        int dup = duplicate(arr);
        System.out.println(dup);
    }
}
