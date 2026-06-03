class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ArrayList<Integer> al = new ArrayList<>();
        // ListNode t1 = list1;
        // ListNode t2 = list2;
        // while(t1!=null){
        //     al.add(t1.val);
        //     t1 = t1.next;
        // }
        // while(t2!=null){
        //     al.add(t2.val);
        //     t2 = t2.next;
        // }
        // Collections.sort(al);
        // ListNode dummy = new ListNode(0);
        // ListNode curr = dummy;
        // for(int num : al){
        //     curr.next = new ListNode(num);
        //     curr = curr.next;
        // }
        // return dummy.next; this is approach one 
        // Aprroach two 
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(t1!= null && t2!=null){
            if(t1.val<t2.val){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1!=null){
            temp.next = t1;
        }
        else{
            temp.next = t2;
        }
        return dummy.next;
    }
}
