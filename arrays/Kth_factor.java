/*
Name:-  The kth Factor of n
complexity - O(n)
bestcase - O(1)

beats 100% of the codes 

Difficulty: Medium

209 / 209 test cases passed.
Status: Accepted
Runtime: 0 ms
Memory Usage: 40.3 MB

link: https://leetcode.com/problems/the-kth-factor-of-n/description/


code :-
*/
class Solution {
    public int kthFactor(int n, int k) {
        int ans = 0;
        for(int i =1; i<=n ;i++)
        {
            if(n%i ==0)
            {
                ans++;
            }

            if(ans == k)
            {
                return i;
            }
        }
        return -1;
        
    }
}
