// firrst method -->> two parse solution 
class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        temp =head;
        int middle = count/2+1;
        for(int i =1;i<middle;i++){
            temp = temp.next;
        }
        return temp;
    }

// second method using tortoise hair algorithm 
public class Solution
{
    public static Node findMiddle(Node head)
    {
       Node slow = head;
       Node fast = head;
       while(fast!=null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
       }
       return slow;
    }
}
