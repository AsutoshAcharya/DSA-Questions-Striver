public class Q23SecondLargenstInArray {
    
        int print2largest(int arr[], int n) {
             int temp=arr[0];
             int index=0;
            for(int i=1;i<n;i++){
                if(arr[i]>temp){
                    temp=arr[i];
                    index=i;
                }
            }
            arr[index]=0;
            int secondLargest=arr[0];
            for(int j=1;j<n;++j){
            if(arr[j]>secondLargest){
                secondLargest=arr[j];
            }
            }
            return secondLargest;
            
        }
    
}
