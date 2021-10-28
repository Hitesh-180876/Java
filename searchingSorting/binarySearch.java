import java.util.Scanner;

public class MyClass {
    public static int binarySearch(int[] array, int x){
        int N = array.length;
        int start = 0;
        int end = N-1;
    
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if (array[mid]>x){
                end = mid-1;
            }
            else if(array[mid]<x){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int[] arr = {1, 4, 7, 10, 20, 35, 40, 0};
        Scanner s = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
        int ans = binarySearch(arr, 0);
        System.out.println(ans);
        
    }
}
