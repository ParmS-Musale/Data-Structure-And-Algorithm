class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Iterate over each element in the array (first loop)
        for (int i = 0; i < nums.length; i++) {
            // Iterate over the elements after the current element (second loop)
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of the current pair of elements equals the target
                if (nums[j] == target - nums[i]) {
                    // If yes, return the indices of the two numbers
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, return null
        return null;
    }
}
