/// method 1  using arralylist and extra space 
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }

        ArrayList<Integer> al = new ArrayList<>();

        ListNode temp = head;

        // Odd indices
        while(temp != null){
            al.add(temp.data);
            if(temp.next == null){
                break;
            }
            temp = temp.next.next;
        }

        // Even indices
        temp = head.next;

        while(temp != null){
            al.add(temp.data);
            if(temp.next == null){
                break;
            }
            temp = temp.next.next;
        }

        // Put values back
        temp = head;
        int i = 0;

        while(temp != null){
            temp.data = al.get(i);
            i++;
            temp = temp.next;
        }

        return head;
    }
}
// second method using pointer appproach 
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenhead = head.next;
        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
            return head;

    }
}
