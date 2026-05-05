 class Node{
        int data;
        Node next;
        Node back;
        Node(int data1,Node next1,Node back1){
            this.data = data1;
            this.next = next1;
            this.back = back1;
        }
        Node(int data1){
            this.data = data1;
            this.next = null;
            this.back = null;
        }
    }
public class doubly_linkedList {
    // converting the array to doubly linked list 
     private static Node array_To_dll(int[] arr){
        int n = arr.length;
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<n;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp; // this creates a back pointer link between previous and temp node 
            prev = temp;
        }
        return head;
    }
    // deleting the head of the linked list 
    private static Node deleteHead(Node head){
        if(head == null || head.next==null){
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }
    // deleting the tail in the linked list 
    private static Node deleteTail(Node head){
        Node Tail = head;
        while(Tail.next!=null){
            Tail = Tail.next;
        }
        Node newtail = Tail.back;
        newtail.next = null;// so one connection to the tail is broken from previous node 
        Tail.back = null;// another connection prom tail to previous node is broken 
        return head;
    }

    // deleting the kth element in the linked list 
    private static Node deleteKthElement(Node head,int k){
        if(head==null){
            return null;
        }
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            if(count==k) break; // temp stops at kth element
            temp = temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;
        if(prev == null && front == null){
            return null;
        }
        if(prev ==null){ // k==1 onr that means u need to delete the first element 
            return deleteHead(head);
        }
        if(front == null){
            return deleteTail(head);  // k== n that means u need to delete the last element in the array 
        }

        // if not all the above cases worked now we need to delete the kth element
        prev.next = front;
        front.back = prev; // forming the connections 
        // free or delete the k th node
        temp.next = null;
        temp.back = null;
        
        return head;

    }
    // deleting the node in the linked list 
    private static void deletNode(Node temp){
        // handling the single node 
    if(temp.back == null && temp.next == null){
    return; // or head = null (depending on use)
}
    Node prev = temp.back;
    Node front = temp.next;

    // case 1: last node
    if(front == null){
        prev.next = null;
        temp.back = null;
        return;   // 🔥 IMPORTANT FIX 
    }

    // case 2: middle node
    prev.next = front;
    front.back = prev;

    temp.next = null;
    temp.back = null;
}

// insertions in doubly linked list 
// inserting am element before the head 
private static Node insertBe_head(Node head,int val){
    Node newhead = new Node(val,head,null);
    if (head!=null){
    head.back = newhead;
    }
    return newhead;
}


    private static void printLL(Node head){
        
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    // inserting the eleemnt before the tail of the linkedlist 
    private static Node insertBe_tail(Node head,int val){
        if(head.next==null){
            return insertBe_head(head, val);
        }
        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        Node prev = tail.back;
        Node bt = new Node(val,tail,prev);
        prev.next = bt;
        tail.back = bt;
        return head;

    }
    // inserting before the kth node in dll
    private static Node insertBe_kthNode(Node head,int k,int val){
        Node temp = head;
        int count = 0;
        if(k==1){
            return insertBe_head(head, val);
        }
        while(temp!=null){
            count++;
            if(count == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newnode = new Node(val,temp,prev);
        prev.next = newnode;
        temp.back = newnode;
        return head;
    }
  // inserting before a node 
    private static void insertBefore_node(Node node,int val){
        Node prev = node.back;
        Node newNode = new Node(val,node,prev);
        prev.next =newNode;
        node.back = newNode;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,8,4,6};
        Node head = array_To_dll(arr);// converting the array to linked list 
        // head = deleteHead(head);  // deleting the head of the linked list 
        // head =  deleteTail(head); // deleting the tail of the linked list 
        // head = deleteKthElement(head, 5); /// deleting the kth element in the linked list 
        // deletNode(head.next.next.next.next); // deleting the node of the linked list 
        // head = insertBe_head(head, 200); // inserting the element before the tail of the linked list 
        // head = insertBe_tail(head, 200); // inserting before the tail 
        // head = insertBe_kthNode(head, 5, 1000); // inserting before new node 
        insertBefore_node(head.next.next.next.next, 1000);

        printLL(head);


    }
}
