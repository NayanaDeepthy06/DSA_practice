class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // ListNode dummy = new ListNode(0);
        // dummy.next = head;

        // ListNode fast = dummy;
        // ListNode slow = dummy;

        // // Move fast n steps ahead
        // for(int i = 0; i <= n; i++){
        //     fast = fast.next;
        // }

        // // Move both pointers
        // while(fast != null){
        //     fast = fast.next;
        //     slow = slow.next;
        // }

        // // Delete nth node from end
        // slow.next = slow.next.next;

        // return dummy.next;  1) dummy method 
        if(head == null || head.next == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        for(int i =0;i<n;i++){
            fast = fast.next;
        }
        if(fast == null) return head.next;
        
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        return head; // 2)tortoise hare algo 

    //      if(head == null || head.next == null){
    //     return null;
    //  }
    //  int count = 0;
    //  ListNode temp = head;
    //  while(temp!=null){
    //     count++;
    //     temp = temp.next;
    //  }
    //  temp = head;
    //  if(count == n){
    //     head = head.next;
    //     return head;
    //  }
    //  ListNode prev = null;
    //  int val = count-n+1;
    //  for(int i =1;i<val;i++){
    //     prev = temp;
    //     temp = temp.next;
    //  }
    //  prev.next = prev.next.next;
    //  return head; 3) using prev node 
      // 4)  method 4 using reducing result 
         if(head ==null || head.next==null){
            return null;
        }
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int res = count - n;
        if(count == n){
            return head.next;
        }
        temp = head;
        while(temp!=null){
            res--;
            if(res == 0){
                break;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
      
    }
}
