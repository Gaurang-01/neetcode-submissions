class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        while (i < matrix.length && target > matrix[i][matrix[0].length - 1]) {
            i++;
        }
        if (i == matrix.length) {
            return false;
        }
        int left = 0;
        int right = matrix[0].length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == matrix[i][mid]) {
                return true;
            } else if (target > matrix[i][mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
