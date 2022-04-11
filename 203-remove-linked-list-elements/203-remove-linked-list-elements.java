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
    public ListNode removeElements(ListNode head, int val) {
        //首先 如果头节点为空, 那么直接返回空
        if(head == null) {
            return head;
        }
        //创建一个新节点dummyNode
        ListNode dummyNode = new ListNode(-1, head);
        //使用哨兵节点Pre 和 cur
        ListNode pre = dummyNode;
        ListNode cur = head;
        while(cur != null) {
            if(cur.val == val) {
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummyNode.next;
    }
}