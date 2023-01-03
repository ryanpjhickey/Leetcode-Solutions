/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode* slowPointer = head; //create our slow pointer
        ListNode* fastPointer = head; //create our fast pointer

        while (fastPointer !=NULL && fastPointer->next != NULL) { //while fastPointer and fastPointer.next nodes exist, do the following
            slowPointer = slowPointer->next; //move our slowPointer over by one
            fastPointer = fastPointer->next->next; //move our fastPointer over by two
        }

        return slowPointer; //return our slowPointer value, which will be the middle node of the linked list
    }
};