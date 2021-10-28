public class MyClass {
    public static int[] merge2SortedArrays(int[] arr1, int[] arr2){
        int M = arr1.length;
        int N = arr2.length;
        int[] arr = new int[N+M];
        
        int i=0;
        int j=0;
        int k=0;
        
        while(i<M && j<N){
            if(arr1[i]<=arr2[j]){
                arr[k] = arr1[i];
                i++;
                k++;
            }
            else{
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
            
        while(i<M){
            arr[k] = arr1[i];
            k++;
            i++;
        }
        while(j<N){
            arr[k] = arr2[j];
            k++;
            j++;
        }
        
        return arr;
    }
    public static void main(String args[]) {
        int arr1[] = {1, 4, 8, 10, 13, 17};
        int arr2[] = {2, 3, 5, 7, 9, 11, 12};
        int[] array = merge2SortedArrays(arr1, arr2);
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
