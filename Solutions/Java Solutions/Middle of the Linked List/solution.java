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
    public ListNode middleNode(ListNode head) {
        ListNode slowPointer = head; //create our slow pointer
        ListNode fastPointer = head; //create our fast pointer

        while (fastPointer != null && fastPointer.next != null) { //while fastPointer and fastPointer.next nodes exist, do the following
            slowPointer = slowPointer.next; //move our slowPointer over by one
            fastPointer = fastPointer.next.next; //move our fastPointer over by two
        };

        return slowPointer; //return our slowPointer value, which will be the middle node of the linked list
    }
}
