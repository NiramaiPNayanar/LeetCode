/*

255 / 255 test cases passed.
Status: Accepted
Runtime: 0 ms
Memory Usage: 41.9 MB

Beats 100% of the solutions 

Complexity: O(N*M)
Best case: O(1)


Name: Jewels and Stones
Difficulty: Easy
Link: https://leetcode.com/problems/jewels-and-stones/submissions/1688598871/

*/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
   
        for(int i=0; i < stones.length(); i++){
 
            for(int j=0;j<jewels.length();j++){
            if(stones.charAt(i) == jewels.charAt(j)){
                count+=1;
    
            } 
            }
        }
        return count;
        
    }
}
