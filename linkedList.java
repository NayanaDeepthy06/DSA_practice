class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
        
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
};
public class linkedList{
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,4,5};
    //     Node n = new Node(arr[3]);
    //     System.out.println(n.data);
    // } creation of linked list 
    // converting array to linked list 
    private static Node arrayToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next  = temp;
            mover = temp;
        }
        return head;     
    }
    private static int length(Node head){// it is used to print the length of the linked list 
        int count = 0;
        Node t = head;
        while(t != null){
            count++;
            t = t.next;
        }
        return count;
    }
    // check if the element is present in the linked list or not 
    private static boolean search(Node head,int val){
        Node t = head;
        while(t!= null){
            if(t.data ==val){
                return true;
            }
            t = t.next;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {12,14,5,6,8,9};
        Node head = arrayToLL(arr);
        System.out.println(head.data); // here iam printing the head part of the linked list 
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        int len= length(head);
        System.out.println(len); 
    }
}
