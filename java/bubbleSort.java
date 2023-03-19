public class bubbleSort {
   public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }

    }
    public static void main(String[] args) {
        int arr[]= {6,4,2,1,9,60};
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]= temp;
            }

            }
        }
        printArr(arr);
    }
    
}
