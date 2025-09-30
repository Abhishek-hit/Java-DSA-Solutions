package LinkedList;

public class DoublyLinkedList {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
        static void print(Node head){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+"<->" );
                temp=temp.next;
            }
            System.out.println ("null" );

        }
        //insert a beginning
        static Node  Addbegin(Node head,int data){
            Node newnode=new Node (data);
            if (head==null){
                return newnode;
            }
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
            return head;

        }
        //insert add last
        static Node addlat(Node head, int data){
            Node newNode=new Node (data);
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
            return head;

        }
        //insert at specific position
        static Node addatspecific(Node head,int data ,int pos){
            Node newNode=new Node (data);
            Node temp = head;
            for (int i = 1; i < pos - 1 && temp != null; i++) {
                temp = temp.next;
            }
            newNode.next=temp.next;
            temp.next.prev=newNode;
            temp.next = newNode;
            newNode.prev = temp;
            return head;
        }
    }

    public static void main(String[] args) {
        Node head=new Node (20);
        Node first=new Node (30);
        Node second=new Node (40);
        head.next = first;    // head -> first
        first.prev = head;    // first <- head
        first.next = second;  // first -> second
        second.prev = first;  // second <- first
        Node.print (head);

        head=Node.Addbegin(head,30) ;
        System.out.println ("after adding" );
        Node.print (head);
        //add at last
        head=Node.addlat (head,60);
        System.out.println ("add last" );
        Node.print (head);
        //add at specific
        head=Node.addatspecific (head,11,3);
        System.out.println ("after given point" );
        Node.print (head);


    }
}
