
/*

Beats 100% of the code 

Name : Convert Binary Number in a Linked List to Integer
Difficutly : Easy
Link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/


102 / 102 test cases passed.
Status: Accepted
Runtime: 0 ms
Memory Usage: 41.5 MB

*/

class Solution {
    public int getDecimalValue(ListNode head) {
        int value = 0;
        while(head != null){
        value = value*2 +head.val; 
        head = head.next;  
        }
        return value;        
    }
}
