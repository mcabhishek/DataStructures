class Delete_operation_of_LikedList
{
    Node head;
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void printLinedList()
    {
        if(head==null)
        {
            System.out.println("the linkked list is null");
        }
        Node Current_node=head;
        while(Current_node!=null)
        {
            System.out.print(Current_node.data+"->");
            Current_node=Current_node.next;
        }
        System.out.println("null");
    }

    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("the linked list has no elements to delete :");
            return;
        }

        if(head.next==null)
        {
            head=null;
            return;
        }
        head=head.next;
    }

    public void deletelast()
    {
        if(head==null)
        {
            System.out.println("the linked list has no elements to delete :");
            return;
        }

        if(head.next==null)
        {
            head=null;
            return;
        }

        Node SecondLastNode=head;
        while(SecondLastNode.next.next!=null)
        {
            SecondLastNode=SecondLastNode.next;
        }
        SecondLastNode.next=null;
    }

    public void deleteByValue(String value)
    {
        String key=value;
        if(head==null)
        {
            System.out.println("the linked list has no elements to delete :");
            return;
        }

        if(head.data.equals(key))
        {
            head=head.next;
            return;
        }

        Node previous=head;
        Node Current=head.next;
        while(Current!=null && !Current.data.equals(value))
        {
            previous=Current;
            Current=Current.next;
        }
        
        if(Current==null)
        {
            System.out.println("the value that given :"+key+"doent present in the list ");
            return;
        }
        previous.next=Current.next;
        System.out.println("the value of :"+key+" : is deleted ");
    }

    public static void main(String args[])
    {
        Linked_List list=new Linked_List();
        list.addFirst("abhi");
        list.addFirst("manja");
        list.addFirst("jeevan");
        list.addFirst("Kokie");

        list.printLinedList();
        list.deleteFirst();
        list.printLinedList();
        list.deleteFirst();
        list.printLinedList();
        list.deleteFirst();
        list.printLinedList();
        list.deleteFirst();
        list.printLinedList();

        list.addFirst("abhi");
        list.addFirst("manja");
        list.addFirst("jeevan");
        list.addFirst("Kokie");

        list.deletelast();
        list.printLinedList();
        list.deletelast();
        list.printLinedList();
        list.deletelast();
        list.printLinedList();

        list.addFirst("abhi");
        list.addFirst("manja");
        list.addFirst("jeevan");

        list.deleteByValue("abhi");
        list.printLinedList();

        list.deleteByValue("Kokie");
        list.printLinedList();
    }
}
