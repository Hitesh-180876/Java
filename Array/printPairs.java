// online jdoodle compiler

public class MyClass {
    
    public static void printArray(int[] array){
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+array[i]+","+array[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int[] arr = {1, 3, 5, 10};
        printArray(arr);
    }
}
