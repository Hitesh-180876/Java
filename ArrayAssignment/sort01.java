/*
Sort 0 1 in one Scan in java

*/
public class MyClass {
    public static void sort(int[] arr){
        int nextZero = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                nextZero+=1;
            }
        }
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }    
    }
    
    public static void main(String args[]) {
        int[] arr = {0, 1, 1, 0, 1, 0, 1};
        sort(arr);
        printArray(arr);
    }
}
