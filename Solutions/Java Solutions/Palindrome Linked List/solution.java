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
    public boolean isPalindrome(ListNode head) {

        ListNode slowPointer = head, fastPointer = head, previousNode, tempVar;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        previousNode = slowPointer;
        slowPointer = slowPointer.next;
        previousNode.next = null;

        while (slowPointer != null) {
            tempVar = slowPointer.next;
            slowPointer.next = previousNode;
            previousNode = slowPointer;
            slowPointer = tempVar;
        }

        fastPointer = head;
        slowPointer = previousNode;

        while (slowPointer != null) {
            if (fastPointer.val != slowPointer.val) return false;
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        
        return true;
    }
}