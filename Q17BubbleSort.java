class Q17BubbleSort
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
       for(int i=0;i<n;i++){
           boolean swapped=false;
           for(int j=0;j<n-i-1;j++){
               if(arr[j+1]<arr[j]){
                   swapped=true;
                   int temp=arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=temp;
               }
               
           }
           if(!swapped){
                   break;
               }
       }
       
    }
}
