'''
Name:-  Reverse String
Time complexity - O(n)
Space complexity - O(1)
bestcase - O(1) 

beats 100% of the codes

Difficulty: Easy
 
477 / 477 test cases passed. 
Status: Accepted
Runtime: 0 ms
Memory Usage: 19.7 MB

link: https://leetcode.com/problems/reverse-string/description/

code :
'''

class Solution(object):
    def reverseString(self, s):
        """
        :type s: List[str]
        :rtype: None Do not return anything, modify s in-place instead.
        """
        lp=0
        hp=len(s)-1

        while lp < hp:
            s[lp] , s[hp] = s[hp] , s[lp]
            lp+=1
            hp-=1

        return s

        
            
        
