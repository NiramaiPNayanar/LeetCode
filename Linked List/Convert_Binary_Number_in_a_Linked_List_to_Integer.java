
/*


Name : Convert Binary Number in a Linked List to Integer
Difficutly : Easy
Link: 


102 / 102 test cases passed.
Status: Accepted
Runtime: 0 ms
Memory Usage: 41.5 MB

*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
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
