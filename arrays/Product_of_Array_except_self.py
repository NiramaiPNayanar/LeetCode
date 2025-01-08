''' 
Complexity : O(n)
link : https://leetcode.com/problems/product-of-array-except-self/description/

'''


class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        product=1
        zero_count =0

        for i in range(len(nums)):
            if nums[i] !=0:
                product*=nums[i]
            else:
                zero_count+=1
        
        List = []
        for i in range(len(nums)):
            if zero_count>1:
                List.append(0)
            elif nums[i] ==0:
                List.append(product)
            else:
                List.append(0 if zero_count>0 else product / nums[i])

        return List
