/*

21040 / 21040 test cases passed.
Status: Accepted
Runtime: 7 ms
Memory Usage: 44.2 MB

Difficulty : Easy

Link:https://leetcode.com/problems/power-of-three/description/?envType=daily-question&envId=2025-08-13

Complexity : O(1)

*/


class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
