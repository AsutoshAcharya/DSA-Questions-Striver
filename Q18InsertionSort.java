class Q18InsertionSort
{
  static void insert(int arr[],int i)
  {
       // Your code here
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
     for(int i=1;i<n;i++){
         int temp=arr[i];
         int j=i-1;
         while(j>=0&&arr[j]>temp){
             arr[j+1]=arr[j];
             j--;
         }
         arr[j+1]=temp;
     }
  }
}