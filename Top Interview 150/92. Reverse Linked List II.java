// 92. Reverse Linked List II

//   Input: head = [1,2,3,4,5], left = 2, right = 4
// Output: [1,4,3,2,5]
// Example 2:

// Input: head = [5], left = 1, right = 1
// Output: [5]

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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0 , head);
        ListNode leftPrev = dummy;
        ListNode curr = head;

        for(int i = 0; i < left-1; i += 1) {
            leftPrev = curr;
            curr = curr.next;
        }
        ListNode prev = new ListNode();

        for(int i = 0; i < right - left + 1; i += 1) {

            ListNode tempNext = curr.next;
            curr.next = prev;

            prev = curr;
            curr = tempNext;
        }
        leftPrev.next.next = curr;
        leftPrev.next = prev;

        return dummy.next;
    }
}
