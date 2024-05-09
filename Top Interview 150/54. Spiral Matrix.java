// 54. Spiral Matrix

//   Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]

// Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]

// solution

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();

        int startRow = 0;
        int startCol = 0;

        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {

            // top
            for(int j = startCol; j <= endCol; j += 1) {
                ans.add(matrix[startRow][j]);
            }
            // left
            for(int i = startRow+1; i <= endRow; i += 1) {
                ans.add(matrix[i][endCol]);
            }
            // bottom
            for(int j = endCol-1; j >= startCol; j -= 1) {

                if(startRow == endRow) {
                    break;
                }
                ans.add(matrix[endRow][j]);
            }
            // left
            for(int i = endRow-1; i >= startRow+1; i -= 1) {

                if(startCol == endCol) {
                    break;
                }
                ans.add(matrix[i][startCol]);
            }
            startRow += 1;
            startCol += 1;
            endRow -= 1;
            endCol -= 1;
        }
        return ans;
    }
}
