''' 


Code :
'''
class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        sette = {}
        for i in range(len(s)):
            if s[i] not in sette :
                sette[s[i]] = 1
            else:
                sette[s[i]] += 1
        for i in range(len(t)):
            if t[i] not in sette :
                return False
            else:
                sette[t[i]] -=1

            if sette[t[i]] < 0 :
                return False 

        for i in range(len(s)):
            if sette[s[i]] != 0:
                return False

        return True
