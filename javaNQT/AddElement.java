package javaNQT;

public class AddElement {
    // for adding at the begining
    static void insertatbegin(int[] arr,int n,int value)
{
    for(int i=n-1;i>=0;i--)
    {
        arr[i+1]=arr[i];
    }
    arr[0]=value;
}
// to add the element at the end of the array 
// ar[n]=value;
//to the add the element btw the array 
static void insertatposition(int[] arr, int n, int value, int pos)
{
    for (int i = n; i >= pos; i--)
    {
        arr[i] = arr[i - 1];
    }
    arr[pos - 1] = value;
}
    
}
