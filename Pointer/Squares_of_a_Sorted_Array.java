/*

Complexity: Question was for O(n^2) did it with O(n)
Difficulty: easy 
Link: 


137 / 137 test cases passed.
Status: Accepted
Runtime: 1 ms
Memory Usage: 47.3 MB

*/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i] = nums[left] * nums[left];
                left++;
            } else {
                res[i] = nums[right] * nums[right];
                right--;
            }
        }
        return res;        
    }
}
