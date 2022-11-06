class frequencyInArray{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        for(int i=1;i<=P;i++){
            
            int count=0;
            for(int j=0;j<N;j++){
                if(arr[j]==i){
                    count++;
                }
                
            }
            System.out.print(count+" ");
        }
    }
}

class FreqencyInArrayElement{
    public static void main(String[] args) {
        int N=5;//number of elements
        int arr[] = {2, 3, 2, 3, 5};
        
        int P=5;//1 to 5 in array arrr

        frequencyInArray obj=new frequencyInArray();
        obj.frequencyCount(arr,N,P);
    }
}


