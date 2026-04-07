class Stack
{
    private int maxsize;
    private int[] stackarray;
    private int top;
    public Stack1(int size)
    {
        maxsize=size;
        stackarray=new int[maxsize];
        top = -1;
    }
    public boolean isFull()
    {
        return top == maxsize-1;
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public void push(int e)
    {
        if(isFull())
        {
            System.out.println("the stack is full :");
            return;
        }
        stackarray[++top]=e;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("the stack is empty");
            return -1;
        }
        return stackarray[top--];
    }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("the stack is empty to show anything");
            return;
        }
        for(int i=top; i>=0; i--)
        {
            System.out.println(stackarray[i]);
        }
    }
    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("the stack is empty");
            return;
        }
        System.out.println(stackarray[top]);
    }
}
class Stack_Operation
{
    public static void main(String args[])
    {
        Stack1 s=new Stack1(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        s.pop();
        s.display();
        s.peek();
    }
}
