import java.util.ArrayList;

public class Q29UnionOfArrays {
  

    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
      ArrayList<Integer> arr=new ArrayList<>(); 
      
      for(int i=0;i<n;i++){
          if(!arr.contains(arr1[i])){
                  arr.add(arr1[i]);
              }
          
          }
          for(int j=0;j<m;j++){
              if(!arr.contains(arr2[j])){
                  arr.add(arr2[j]);
              }
      }
      return arr;
    }

}
