class Solution {
    public boolean searchMatrix(int[][] nums, int target) {

        int i = 0;
        int j = nums[0].length - 1;

        while (i < nums.length && j >= 0) {

            if (nums[i][j] == target) {
                return true;
            }

            else if (target < nums[i][j]) {
                j--;
            }

            else {
                i++;
            }
        }

        return false;
    }
}