class Solution {
     public int findLengthOfLoop(ListNode head) {
        ListNode temp = head;
        HashMap<ListNode,Integer> mp = new HashMap<>();
        int timer = 1;
        while(temp!=null){
        if(mp.containsKey(temp)){
            return timer - mp.get(temp);
        }
        mp.put(temp,timer);
        timer++;
        temp = temp.next;
        }
        return 0;
     }
 } // this is using hashmap method
class Solution {
    private static int findlength(ListNode slow,ListNode fast){
        int count = 1; 
        fast = fast.next;
        while(slow!=fast){
           count++;
           fast = fast.next;
        }
        return count;
    }
     public int findLengthOfLoop(ListNode head) {
          ListNode slow = head;
          ListNode fast = head;
          while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return findlength(slow,fast);
            }
          }
          return 0;
     }
 } /// this is using tortoise and hare mthod 
