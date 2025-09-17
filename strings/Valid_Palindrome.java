/*


487 / 487 test cases passed.
Status: Accepted
Runtime: 14 ms
Memory Usage: 44.8 MB

Link :https://leetcode.com/problems/valid-palindrome/
Difficulty : Easy
Name : Valid Palindrome

Concept : Used Regex to bypass the problem

*/
class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase().replaceAll("[^a-z0-9]","");
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
