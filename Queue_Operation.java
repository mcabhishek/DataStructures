import java.util.Scanner;
class queue
{
    int front,rear,size;
    int arr[];
    queue(int size)
    {
        this.size=size;
        arr=new int[size];
        front =-1;
        rear =-1;
    }
    boolean isEmpty()
    {
        if(front == -1 || rear < front)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isFull()
    {
        return rear ==size-1;
    }
    void enqueue(int value)
    {
        int v=value;
        if(isFull())
        {
            System.out.println("the queue is full");
            return;
        }
        if(front==-1)
        {
            front=0;
        }
        arr[++rear]=value;
        System.out.println("the "+v+"added successfully");
    }
    void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("the queue is empty :");
            return;
        }
        else
        {
            System.out.println("the "+arr[front]+"is deleted");
            front++;
        }
    }    
    void display()
    {
        if(isEmpty())
        {
            System.out.println("the queue is empty");
            return;
        }
        System.out.print("the elements of queue are : [ ");
        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print(" ]");
    }
    void peek()
    {
        if(isEmpty())
        {
            System.out.println("the queue is empty");
            return;
        }
        System.out.println("the top most element is "+arr[rear]);
    }
}
class Queue_Operation
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        // System.out.print("enter the size of the queue : ");
        // int size=sc.nextInt(); 
        queue q= new queue(17);
        q.display();
        q.enqueue(19);
        q.enqueue(23);
        q.enqueue(56);
        q.enqueue(23);
        q.enqueue(463);
        q.enqueue(2345);
        q.enqueue(53);
        q.display();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display();
        q.peek();
        sc.close();

    }
}
