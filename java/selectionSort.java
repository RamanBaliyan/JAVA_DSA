public class selectionSort {
  
        public static void printArr(int arr[]){
             for(int i=0;i<arr.length;i++){
                 System.out.println(arr[i]);
     
             }
     
         }
         public static void main(String[] args) {
             int arr[]= {6,4,2,1,9,60};
             for (int i=0;i<arr.length;i++){
                int smallest=i;
                 for(int j=i+1;j<arr.length;j++){

                 if(arr[j]<arr[smallest]){

                smallest=j;
                 }
                 }
                 int temp=arr[smallest];
                 arr[smallest]=arr[i];
                 arr[i]=temp;
             }
             printArr(arr);
         }
         
     }
     

