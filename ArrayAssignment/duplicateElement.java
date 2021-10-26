/* online jdoodle compiler 

finding duplicate element from Array 
Time complexity = O(N^2)

*/
public class MyClass {
    public static int duplicateArray(int[] arr){
        int N = arr.length;
        for(int i =0; i<N; i++){
            for(int j=0; j<N; j++){
                if(i != j){
                    if(arr[i] == arr[j]){
                        return arr[i];
                    }
                }
            }
        }
        return Integer.MIN_VALUE;
    }
    
    public static void main(String args[]) {
        int[] arr = {3, 3, 5, 1, 2};
        int dup = duplicateArray(arr);
        System.out.println(dup);
    }
}

/*
Time complexity = O(N)

*/
public class MyClass {
    public static int duplicateArray(int[] arr){
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = ans^arr[i]^i;
        }
        return ans;
    }
    
    public static void main(String args[]) {
        int N = 6;
        int[] arr = {2,1,4,5,5,3};
        int ans = 0;
        
        for(int i=0; i<6; i++){
            ans = ans^arr[i]^i;
        }
        
        //int dup = duplicateArray(arr);
        System.out.println(ans);
    }
}
