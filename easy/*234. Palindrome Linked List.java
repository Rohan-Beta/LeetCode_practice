// 234. Palindrome Linked List

//   Input: head = [1,2,2,1]
// Output: true

//   Input: head = [1,2]
// Output: false

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
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public boolean isPalindrome(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null) {
            slow = slow.next;
        }
        slow = reverseList(slow);

        while(slow != null) {
            if(slow.val != head.val) {
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }
}
