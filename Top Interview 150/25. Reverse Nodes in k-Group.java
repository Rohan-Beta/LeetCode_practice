// 25. Reverse Nodes in k-Group

//   Input: head = [1,2,3,4,5], k = 2
// Output: [2,1,4,3,5]
// Example 2:
// Input: head = [1,2,3,4,5], k = 3
// Output: [3,2,1,4,5]

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
    public int getLength(ListNode head) {
        int len = 0;

        for(ListNode curr = head; curr != null; curr = curr.next) {
            len += 1;
        }
        return len;
    }
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head == null || k == 1) {
            return head;
        }
        int length = getLength(head);

        ListNode dummy = new ListNode(0 , head);
        ListNode prev = dummy;
        ListNode curr = head;

        for(int i = 0; i < length / k; i += 1) {
            for(int j = 0; j < k-1; j += 1) {

                ListNode next = curr.next;
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
            }
            prev = curr;
            curr = curr.next;
        }
        return dummy.next;
    }
}
