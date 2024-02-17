// 203. Remove Linked List Elements

//   Input: head = [1,2,6,3,4,5,6], val = 6
// Output: [1,2,3,4,5]
// Example 2:

// Input: head = [], val = 1
// Output: []
// Example 3:

// Input: head = [7,7,7,7], val = 7
// Output: []

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
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0 , head);
        ListNode prev = dummy;

        while(head != null) {
            if(head.val != val) {

                prev.next = head;
                prev = prev.next;
            }
            head = head.next;
        }
        prev.next = null;

        return dummy.next;
    }
}
