class Solution {
    public int[][] generateMatrix(int n) {
        int top = 0, left = 0;
        int bottom = n-1, right = n-1;
        int curVal = 0;
        int[][] arr = new int[n][n];
        while (top <= bottom && left <= right) {
            for (int index = left; index <= right; index++) {
                arr[top][index] = ++curVal;
            }
            for (int index = top+1; index <= bottom; index++) {
                arr[index][right] = ++curVal;
            }
            for (int index = right-1; index >= left; index--) {
                arr[bottom][index] = ++curVal;
            }
            for (int index = bottom-1; index > top; index--) {
                arr[index][left] = ++curVal;
            }
            top++;
            left++;
            right--;
            bottom--;
        }
        return arr;
    }
}