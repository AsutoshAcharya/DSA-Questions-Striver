class Q21QuickSort
{
   
    static void quickSort(int arr[], int low, int high)
    {
        if(low<high){
            int pivot=partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot&& i <= high - 1){
                i++;
            }
            while(arr[j]>=pivot && j >= low){
                j--;
            }
            if(i<j){
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp2=arr[j];
        arr[j]=arr[low];
        arr[low]=temp2;
        return j;
    } 
}