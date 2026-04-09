import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int value)
    {
        this.data=value;
        this.next=null;
    }
}
class linked_list
{
    Node head;
    void insert_at_Begining(int value)
    {
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
    }
    void insert_at_end(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            System.out.println(data + " inserted as first node");
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        System.out.println(data + " inserted as first node");
        return;
    }
    void delete(int key)
    {
        Node temp=head;
        Node prev=null;
        if(temp!=null && temp.data==key)
        {
            head=temp.next;
            System.out.println(temp.data+"is deleted");
        }
        while(temp.next!=null && temp.data!=key)
        {
            prev=temp;
            temp=temp.next;
        }
        if(temp==null)
        {
            System.out.println("the value not found ");
            return;
        }
        prev.next=temp.next;
        System.out.println(temp.data+"is deleted");
    }
    void display()
    {
        if(head == null)
        {
            System.out.println("the Linked list is empty :");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println(" null");
    }
}
public class linked_list_main {
    public static void main(String args[])
    {
        // linked_list ll=new linked_list();
        // ll.insert_at_Begining(10);
        // ll.insert_at_Begining(1);
        // ll.insert_at_Begining(7);
        // ll.insert_at_Begining(8);
        // ll.insert_at_Begining(8);
        // ll.display();
        // ll.insert_at_end(10);
        // ll.insert_at_end(1);
        // ll.insert_at_end(7);
        // ll.insert_at_end(8);
        // ll.insert_at_end(8);
        // ll.display();
        // ll.delete(1);
        // ll.delete(7);
        // ll.display();

        Scanner sc = new Scanner(System.in);
        linked_list list = new linked_list();
        int choice, value;

        do {
            System.out.println("\n--- Linked List Menu ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    list.insert_at_Begining(value);;
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    list.insert_at_end(value);;
                    break;

                case 3:
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();
                    list.delete(value);
                    break;

                case 4:
                    list.display();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
