/*
link : https://leetcode.com/problems/maximum-average-subarray-i/description/

Difficulty : Easy

Complexity : O(n)

Used sliding window 

127 / 127 test cases passed.
Status: Accepted
Runtime: 2 ms
Memory Usage: 55.4 MB

Beats 99.4% of the codes

*/


class Solution {
    public double findMaxAverage(int[] nums, int k) {
   long sum = 0;
   
   for(int i =0; i<k ; i++){
    sum += nums[i];
   }
   long avg = sum;
   for(int i =k; i< nums.length ; i++){
    sum = sum + nums[i] - nums[i-k];
    avg = Math.max(avg, sum);
   }
   return (double)avg/k;
    }

}
