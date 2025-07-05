/*

101 / 101 test cases passed.
Status: Accepted
Runtime: 5 ms
Memory Usage: 43.6 MB



Best case complexity : O(N)
Worst case complexity : O(N)
Average case complexity : O(N)

Name : Find Lucky Integer in an Array
Difficulty : Easy
Link : https://leetcode.com/problems/find-lucky-integer-in-an-array/

*/

class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> set = new HashMap<>();

        for(int i =0; i< arr.length; i++){
            if(!set.containsKey(arr[i])){
               set.put(arr[i], 1);
            }  
            else {
                set.put(arr[i], set.get(arr[i])+1);
            }

        }
        int output = -1;

        for (int key : set.keySet()) {
            if (key == set.get(key)) {
                if (key > output) {
                    output = key;
                }
            }
        }
return output;
    }
}
