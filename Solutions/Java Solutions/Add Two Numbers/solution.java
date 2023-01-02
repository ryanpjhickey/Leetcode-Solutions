/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0; //create our useful vars
        ListNode head = new ListNode(0);
        ListNode pointer = head;

        while (l1 != null || l2 != null || carry != 0) { //check if any of our vars have any value
            if (l1 != null) { //while l1 has value, add that value to our carry var, and then set l1 to l1.next
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) { //while l2 has value, add that value to our carry var, and then set l2 to l2.next
                carry += l2.val;
                l2 = l2.next;
            }
            pointer.next = new ListNode(carry % 10); //set our pointer.next value to divide our carry var by 10 with remainder
            carry /= 10; //divde carry var by 10 again
            pointer = pointer.next; //set our pointer to pointer.next
        }
        return head.next; //return our answer
    }
};