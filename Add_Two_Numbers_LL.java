/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carry = 0;
        int sum = 0;
        while(temp1!=null || temp2!=null){
            sum = carry;
            if(temp1!=null) sum = sum + temp1.data;
            if(temp2!=null) sum = sum + temp2.data;
            ListNode newnode = new ListNode(sum%10);
            carry = sum/10;
            curr.next = newnode;
            curr = newnode;// curr = curr.next;
            if(temp1!=null) temp1 = temp1.next;
            if(temp2!=null) temp2 = temp2.next;

        }
        if(carry!=0){
            ListNode newnode = new ListNode(carry);
            curr.next = newnode;
            curr = curr.next;
        }
        return dummy.next;
    }
}
