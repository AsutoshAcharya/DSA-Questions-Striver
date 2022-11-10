class Compute {
    
    public int largest(int arr[], int n)
    {
        int temp=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        
        return temp;
    }
    
}
