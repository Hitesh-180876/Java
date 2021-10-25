/*  
swap Alternates 

  Input = [1, 3, 4, 9, 0, 2]
  output =[3, 1, 9, 4, 2, 0]

*/
public class MyClass {
    
    public static void swapAlternate(int[] arr){
        int N = arr.length;
        
        for(int i=0; i<N-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int i=0; i<N; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        int[] arr = {1, 3, 5, 10, 11, 2};
        swapAlternate(arr);
    }
}
