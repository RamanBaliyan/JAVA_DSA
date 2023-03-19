public class insertionSort {
     public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i] +"" );
    }
    public static void main(String[] args) {
        int arr[]= {8,5,32,4,6,42,6};
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;

            } 
            arr[j+1]=current;
        }
    
    printArr(arr);
} 
}
