// 48. Rotate Image

//   Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[7,4,1],[8,5,2],[9,6,3]]

// Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
// Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

// solution

class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i = 0 , j = matrix.length-1; i < j; i += 1 , j-= 1) {

            int temp[] = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
        }
        for(int i = 0; i < matrix.length; i += 1) {
            for(int j = i+1; j < matrix.length; j += 1) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
