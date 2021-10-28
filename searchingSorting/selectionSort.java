public class MyClass {
    public static void selectionSort(int[] arr){
        int N = arr.length;
        
        for(int i=0; i<N-1; i++){
            int minValue = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int j = i; j<N; j++){
                if(arr[j]<minValue){
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            
        }
    }
    public static void main(String args[]) {
        int arr[] = {1, 3, 0, 4, 2, 7, 6};
        selectionSort(arr);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
