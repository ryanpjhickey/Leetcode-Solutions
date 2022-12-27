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
var isPalindrome = function (head) {

    let charArray = []; //define our empty array

    while (head) {
        charArray.push(head.val);
        head = head.next;
    }

    let start = 0;
    let end = charArray.length - 1;

    while (start <= end) {
        if (charArray[start] !== charArray[end]) {
            return false; //if the Left to Right and the Right to Left of the array are not the same, return false. If this condition is not met, it will ignore and return as true
        }
        start++, end--;
    }
    return true;
};