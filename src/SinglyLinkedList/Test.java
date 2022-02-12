package SinglyLinkedList;

import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}

class SinglyLinkedList
{
    Node head;
    Node tail;
    public void insertAtBegin(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            newnode.next=head;
            head=newnode;
        }
    }

    public void insertAtLast(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            tail.next=newnode;
            tail=newnode;
        }
    }

    public void insertAfterNode(int data,Node newnode)
    {
        Node temp=head;
        if(head==null)
            System.out.println("Empty Linked List");
        else
        {
            while(temp!=null)
            {   Node t=temp.next;
                if(t.data==data)
                {
                    break;
                }
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }
    public void insertAtPos(int pos, Node newnode)
    {
        Node temp=head;
        int c=0;
        if(head==null)
            System.out.println("Empty Linked List");
        else if(pos==1)
            insertAtBegin(newnode);
        else
        {
            while(temp!=null)
            {
                temp=temp.next;
                c++;

            }
            if(c>=pos)
            {
                System.out.println("Valid position");
                temp=head;
                for(int i=0;i<c;i++)
                {
                    if(i==pos-2)
                    {
                        newnode.next=temp.next;
                        temp.next=newnode;
                        break;
                    }
                    temp=temp.next;
                }
            }
            else
                System.out.println("Invalid Position");
        }
    }
    public void deleteFromLast()
    {
        if(head==null)
        {
            System.out.println("Empty Linked List");
        }
        else
        {
            Node temp=head;
            while(temp.next!=tail)
            {
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
    }

    public void deleteFromBegin()
    {
        if(head==null)
        {
            System.out.println("Empty Linked List");
        }
        else
        {
            head=head.next;
        }
    }

    public void delete_node(int data)
    {

    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("Empty Linked List");
        }
        else
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    public void search(int key)
    {
        if(head==null)
        {
            System.out.println("Empty Linked List");
        }
        else
        {
            Node temp=head;
            while(temp!=null)
            {
                if(temp.data==key)
                {
                    System.out.println("Element found in the linked list");
                    break;
                }
                temp=temp.next;
            }
            if(temp==null)
            {
                System.out.println("Element not Found in the linked list");
            }
        }
    }

}
public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Node n1=new Node(s.nextInt());
        SinglyLinkedList list=new SinglyLinkedList();
        list.head=n1;
        list.tail=n1;
        list.insertAtLast(n1);
        list.insertAtLast(new Node(s.nextInt()));
        list.insertAtLast(new Node(40));
        list.insertAtBegin(new Node(s.nextInt()));
        list.display();
        list.search(20);
        list.search(50);
        SinglyLinkedList l2=new SinglyLinkedList();
        Node n2=new Node(0);
        l2.head=n2;
        l2.tail=n2;
        l2.insertAtLast(n2);
        l2.insertAtLast(new Node(1));
        l2.insertAtLast(new Node(2));
        l2.insertAtBegin(new Node(3));
        l2.display();
        list.deleteFromBegin();
        list.deleteFromLast();
        list.insertAfterNode(20,new Node(50));
        list.insertAtPos(1,new Node(80));
//        list.merge(l2);
//        System.out.println(l2);
//        System.out.println(l2.head);
        list.display();


    }
}
