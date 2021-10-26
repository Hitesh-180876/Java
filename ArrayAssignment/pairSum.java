/*
Find pairs whose sum is X

*/
public class MyClass {
    public static int pairSum(int[] arr, int X){
        int count = 0;
        
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == X){
                    count+=1;
                }
            }
        }
        return count;
    }
    public static void main(String args[]) {
        int[] arr = {2, 8, 10, 5, -2, 5};
        int x = 10;
        int pairs = pairSum(arr, x);
        System.out.println(pairs);
    }
}
