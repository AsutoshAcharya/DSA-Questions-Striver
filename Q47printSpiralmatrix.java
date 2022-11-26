// Given an m x n matrix, return all elements of the matrix in spiral order.

 

// Example 1:


// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int left=0,right=matrix[0].length;
        int top=0,bottom=matrix.length;
        while(left<right && top<bottom){
        for(int i=left;i<right;i++){
            list.add(matrix[top][i]);
        }
        top+=1;
        for(int i=top;i<bottom;i++){
            list.add(matrix[i][right-1]);
        }
        right-=1;
         if (!(left<right && top<bottom)){
                break;
            }
        for(int i=right-1;i>left;i--){
            list.add(matrix[bottom-1][i]);
        }
        bottom-=1;
        for(int i=bottom;i>=top;i--){
            list.add(matrix[i][left]);
        }
        left+=1;
    }
        return list;
    }
    
}