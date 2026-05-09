class Solution {

    public static Node reverseDLL(Node head) {

        // Empty list or single node
        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;
        Node last = null;

        while (temp != null) {

            // store previous node
            last = temp.prev;

            // swap prev and next
            temp.prev = temp.next;
            temp.next = last;

            // move to next node
            temp = temp.prev;
        }

        // new head
        head = last.prev;

        return head;
    }
}
