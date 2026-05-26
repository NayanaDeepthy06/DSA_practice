// approach 1 is using middle elements
class Solution {
    public ListNode deleteMiddle(ListNode head) {

        if(head == null || head.next == null){
            return null;
        }

        ListNode temp = head;
        int count = 0;

        // Count nodes
        while(temp != null){
            count++;
            temp = temp.next;
        }

        int middle = count / 2;

        temp = head;

        // Go to node before middle
        for(int i = 0; i < middle - 1; i++){
            temp = temp.next;
        }

        // Delete middle node
        temp.next = temp.next.next;

        return head;
    }
}
// Approach two is using  tortoise and hare and previous node 
 public static Node deleteMiddle(Node head) {
        if(head == null ||head.next==null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        slow.next = null;
        return head;
}
}
// Approach 3 is using skipping one slow pointeer
class Solution {
    public ListNode deleteMiddle(ListNode head) {
       if(head == null || head.next == null){
        return null;}
        ListNode slow = head;
        ListNode fast = head;
        fast = fast.next.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode del = slow.next;
        slow.next = slow.next.next;
        del.next = null;
       
       return head;
    }
}
