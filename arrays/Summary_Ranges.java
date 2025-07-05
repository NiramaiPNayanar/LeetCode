/*

34 / 34 test cases passed.
Status: Accepted
Runtime: 5 ms
Memory Usage: 42 MB

complexity - O(N)
bestcase - O(N)

Name:  Summary Ranges
Difficulty level : Easy
Link: https://leetcode.com/problems/summary-ranges/description/
 
*/



class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> output = new ArrayList<>();
        if(nums.length == 0) {
            return output;
        }
        int starter = nums[0];
        

        for(int i =1; i<= nums.length ; i++){
            if(i== nums.length || nums[i] != nums[i-1]+1 ){
                if(starter == nums[i-1]){
                    output.add(String.valueOf(starter));
                }else{
                    output.add(starter+ "->" + nums[i-1]);
                }
            if(i<nums.length){
                starter = nums[i];
            }
            }
        }
        return output;

    }
}
