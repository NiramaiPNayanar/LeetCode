/*

Beats 100% of the solutions 

212 / 212 test cases passed.
Status: Accepted
Runtime: 0 ms
Memory Usage: 41.8 MB

Complexity : O(n)

Time complexity - O(n)
Space complexity - O(1)
Best Case - O(1)
Average Case - O(1)
Worst Case - O(1)

Difficulty : Easy
link : https://leetcode.com/problems/maximum-repeating-substring/


*/



class Solution {
    public int maxRepeating(String sequence, String word) {
      int count = 1;
      while(sequence.contains(word.repeat(count))){
        count+=1;
      }
      return count-1;
    }
}
