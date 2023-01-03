/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var middleNode = function (head) {

    let slowPointer = head; //create our pointers
    let fastPointer = head;

    while (fastPointer != null && fastPointer.next != null) { //while fastPointer and fastPointer.next both have values...
        slowPointer = slowPointer.next; //move slowPointer right by one
        fastPointer = fastPointer.next.next; //move fastPointer right by two
    };

    return slowPointer; //return our slowPointer when fastPointer and fastPointer.next both do not have values, which will be the middle of the linked list
};