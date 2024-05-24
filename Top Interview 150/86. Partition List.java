// 86. Partition List

//   Input: head = [1,4,3,2,5,2], x = 3
// Output: [1,2,2,4,3,5]
// Example 2:

// Input: head = [2,1], x = 2
// Output: [1,2]

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
    public ListNode partition(ListNode head, int x) {
        
        ListNode beforeHead = new ListNode();
        ListNode afterHead = new ListNode();

        ListNode before = beforeHead;
        ListNode after = afterHead;

        while(head != null) {

            if(head.val < x) {
                before.next = head;
                before = head;
            }
            else {
                after.next = head;
                after = head;
            }
            head = head.next;
        }
        after.next = null;
        before.next = afterHead.next;

        return beforeHead.next;
    }
}
