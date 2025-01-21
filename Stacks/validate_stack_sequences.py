''' 

152 / 152 test cases passed.
Status: Accepted
Runtime: 4 ms
Memory Usage: 12.5 MB

Best Time Complexity - O(n)

Difficulty : Medium 
link: https://leetcode.com/problems/validate-stack-sequences/description/

code :
'''
 
class Solution(object):
    def validateStackSequences(self, pushed, popped):
        """
        :type pushed: List[int]
        :type popped: List[int]
        :rtype: bool
        """
        stack = []
        i=0

        for num in pushed:
            stack.append(num)
            while len(stack) >0 and stack[len(stack)-1] == popped[i]:
                stack.pop()
                i+=1
        return True if len(stack) ==0 else False
        
