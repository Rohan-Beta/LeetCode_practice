// 73. Set Matrix Zeroes

//   Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]

// Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

// solution

class Solution {
    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean rowZeros = false;

        for(int r = 0; r < rows; r += 1) {
            for(int c = 0; c < cols; c += 1) {

                if(matrix[r][c] == 0) {
                    matrix[r][0] = 0;

                    if(r > 0) {
                        matrix[0][c] = 0;
                    }
                    else {
                        rowZeros = true;
                    }
                }
            }
        }
        for(int r = 1; r < rows; r += 1) {
            for(int c = 1; c < cols; c += 1) {

                if(matrix[r][0] == 0 || matrix[0][c] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }
        if(matrix[0][0] == 0) {
            for(int r = 0; r < rows; r += 1) {
                matrix[r][0] = 0;
            }
        }
        if(rowZeros == true) {
            for(int c = 0; c < cols; c += 1) {
                matrix[0][c] = 0;
            }
        }
    }
}
