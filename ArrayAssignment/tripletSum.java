public class MyClass {
    public static int pairSum(int[] arr, int X){
        int count = 0;
        
        for(int i = 0; i<arr.length-2; i++){
            for(int j = i+1; j<arr.length-1; j++){
                for(int k= j+1; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k] == X){
                        count+=1;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String args[]) {
        int[] arr = {12, 3, 4, 1, 6, 9};
        int x = 24;
        int pairs = pairSum(arr, x);
        System.out.println(pairs);
    }
}
