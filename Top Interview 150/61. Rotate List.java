// 61. Rotate List

// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]
// Example 2:
// Input: head = [0,1,2], k = 4
// Output: [2,0,1]

// solution

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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null) {
            return head;
        }
        int length = 1;
        ListNode tail = head;

        // length
        while(tail.next != null) {
            tail = tail.next;
            length += 1;
        }
        k = k % length;

        if(k == 0) {
            return head;
        }
        ListNode curr = head;

        // pivot
        for(int i = 0; i < length-k-1; i += 1) {
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;

        tail.next = head;
        
        return newHead;
    }
}
