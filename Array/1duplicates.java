/*
Find unique elenment in arrray
*/
// jdoodle online java compiler;
public class MyClass {
    public static int duplicate(int[] arr){
        for(int i=0;i<arr.length; i++){
            int j;
            for(j=0; j<arr.length; j++){
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
        int[] arr = {1, 3, 3, 1, 4, 5, 5};
        int dup = duplicate(arr);
        System.out.println(dup);
    }
}
