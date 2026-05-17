
public class Solution {
    public static boolean isPalindrome(Node head) {
       if(head.next == null || head ==null){
            return true;
        }
       Node slow = head;
       Node fast = head;
       while(fast.next!=null && fast.next.next!=null){
           slow  = slow.next;
           fast = fast.next.next;
       }
       Node newhead = reverse(slow.next);
       Node first = head;
       Node second = newhead;
       while(second!=null){
           if(first.data!=second.data){
               reverse(newhead);
               return false;
           }
           first = first.next;
           second = second.next;
           
       }
       return true;
    }
    private static Node reverse(Node head){
        if(head.next == null || head ==null){
            return head;
        }
        Node prev = null;
        Node temp = head;
        while(temp!=null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;

    }
} // this is method used prev node to reverse the linked list 
class Solution {
    public boolean isPalindrome(ListNode head) {
        // Stack<Integer> st = new Stack<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     st.push(temp.val);
        //     temp = temp.next;
        // }
        // temp = head;
        // while(temp!=null){
        //     if(temp.val!=st.pop()){
        //         return false;
        //     }
        //     temp = temp.next;
        // }
        // return true;  // this method is using stack approach 

        //2nd method is using two pointer approach 
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        ListNode newhead = reverse(slow.next);
        ListNode first = head;
        ListNode second = newhead;
        while(second!=null){
            if(first.val != second.val){
                reverse(newhead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverse(newhead);
        return true;

    }
    private static ListNode reverse(ListNode head){
        if(head == null || head.next==null){
            return head;
        }
        ListNode newhead = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newhead;
    }
}
