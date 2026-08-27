package LinkedList;

public class LinkedList {
    static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //print linked list
public static void printList(Node head){
          Node temp=head;
          while (temp!=null){
        System.out.print(temp.data+"->" );
        temp=temp.next;
    }
    System.out.println ("null" );


}
//insert at beginning
    public static Node insertAtbegin(Node head,int data){
        Node newNode=new Node (data);
        newNode.next=head;
        head=newNode;
        return head;
    }
 //insertion at end
 public static Node insertAtEnd(Node head,int data){
        Node newNode=new Node (data);
        Node temp=head;
     if (head ==null) {
         head=newNode;
     }
        while (temp.next!=null){
            temp=temp.next;
        }
            temp.next=newNode;
        return head;

 }

 //insert at given positionb
    public static Node inserAtGivnePosition(Node head,int data,int pos){
        Node newNode=new Node (data);
         Node temp=head;
        if (pos==1){
            newNode.next=head;
            return head;
        }
        else if (temp==null){
            System.out.println ("out of bond" );
            return head;
        }
        for (int i=1; i<pos-1 && temp!=null; i++){
            temp=temp.next;
        }

        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }
    //delte at given postion
    static Node deleteAtPos(Node head, int pos){
        if (head==null){
            return null;
        }
        if (pos==1){
            return head.next;
        }
        Node temp=head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of range!");
            return head;
        }
        temp.next=temp.next.next;
        return head;
    }
    //reverse
    static Node reverse(Node head) {
        Node prev = null, curr = head, next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head=new Node (5);
        Node first=new Node (6);
        Node second=new Node (15);
        Node third=new Node (1);
        head.next=first;
        first.next=second;
        second.next=third;
        printList (head);
        head=insertAtbegin (head,12);
        printList (head);
 //at end
        head=insertAtEnd (head,36);
        printList (head);
        //at specific postion
        head=inserAtGivnePosition (head,22,3);
        printList (head);
        //delete at given postion
        head=deleteAtPos (head,3);
        printList (head);
        System.out.println ("reverse linked list" );
        head=reverse (head);
        printList (head);


    }
}
