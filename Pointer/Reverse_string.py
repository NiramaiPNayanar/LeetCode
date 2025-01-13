


'''

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

        
            
        
