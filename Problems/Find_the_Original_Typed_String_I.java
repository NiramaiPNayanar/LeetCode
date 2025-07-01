/*

780 / 780 test cases passed.
Status: Accepted
Runtime: 0 ms
Memory Usage: 42.2 MB

Best Case : O(n)
Average Case : O(n)
Worst Case : O(n)

Time complexity - O(n)
Space complexity - O(1)

Name : Find The Original Typed String I

Difficulty : Easy 
Link : https://leetcode.com/problems/find-the-original-typed-string-i/description/


*/


class Solution {
    public int possibleStringCount(String word) {
        int count = 1;
        for (int i =0 ; i < word.length() -1; i ++){
            if (word.charAt(i) == word.charAt(i+1)) {
                count +=1;
            }
        }

        return count;
    }
}
