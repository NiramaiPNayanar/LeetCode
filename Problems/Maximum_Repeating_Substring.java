/*

212 / 212 test cases passed.
Status: Accepted
Runtime: 0 ms
Memory Usage: 41.8 MB

Complexity : O(n)

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
