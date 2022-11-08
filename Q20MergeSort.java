
    class Q20MergeSort
{
    void merge(int arr[], int l, int m, int r)
    {
           int i = l; // starting index of left half of arr
              int j = m + 1; // starting index of right half of arr
              int f = l; // index used to transfer elements in temporary array
              int temp[] = new int[100000]; // temporary array

              // storing elements in the temporary array in a sorted manner//

              while (i <= m && j <= r) {
                     if (arr[i] < arr[j]) {
                            temp[f] = arr[i];
                            i++;
                     } else {
                            temp[f] = arr[j];
                            j++;
                     }
                     f++;
              }

              // if elements on the left half are still left //

              if (i > m) {
                     while (j <= r) {
                            temp[f] = arr[j];
                            f++;
                            j++;
                     }
              } else {
                     // if elements on the right half are still left //
                     while (i <= m) {
                            temp[f] = arr[i];
                            f++;
                            i++;
                     }
              }

              // transfering all elements from temporary to arr //
              for (f = l; f <= r; f++) {
                     arr[f] = temp[f];
              }
       } 
    
    void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
                     int mid = (l + r) / 2;
                     mergeSort(arr, l, mid);
                     mergeSort(arr, mid + 1, r); 
                     merge(arr, l, mid, r); 
              }
    }
}


