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

        ListNode slowPointer = head; //create our pointers and other useful vars
        ListNode fastPointer = head;
        ListNode previousNode;
        ListNode temp;

        while (fastPointer != null && fastPointer.next != null) { //while fast pointer and fastpointer.next both have values, make both pointers move 1 & 2 respectively
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        previousNode = slowPointer; //set our prev node to slowPointer location
        slowPointer = slowPointer.next; //set our slowPointer to slowPointer next. It is moving and prevNode will be the old slowPointer location.
        previousNode.next = null; //define prevNode.next as null to lock prevNode in it's current position

        while (slowPointer != null) { //As long as slowPointer still has a value, set temp = slowPointer.next = prevNode = slowPointer
            temp = slowPointer.next; //set our temp to slowPointer.next
            slowPointer.next = previousNode; //set slowPointer.next to prevNode
            previousNode = slowPointer; //set prevNode to our slowPointer
            slowPointer = temp; //set slowPointer to temp
        }

        fastPointer = head; //reset our fastPointer to head
        slowPointer = previousNode; //reset our slowPointer to previousNode

        while (slowPointer != null) { //if slowPointer still has a value, loop through the list
            if (fastPointer.val != slowPointer.val) return false; //if vals are not a palindrome, return false
            fastPointer = fastPointer.next; //move fastPointer over to check next node
            slowPointer = slowPointer.next; //move slowPointer over to check next node
        }
        
        return true; //return true if it is a palindrome
    }
}