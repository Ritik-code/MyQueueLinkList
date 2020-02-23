package stark;

class Node4
{
    int data;
    Node4 next;

    public Node4(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyQueueLinkList {
    Node4 head;
    Node4 end;
    MyQueueLinkList()
    {
        head = null;
        end = null;
    }
    public void enqueue(Node4 newnode)
    {
        if(head == null)
        {
            head = newnode;
            end = newnode;
            System.out.println("Node Inserted.");
        }
        else
        {
            end.next = newnode;
            end = newnode;
            System.out.println("Node Inserted.");
        }
    }
    public void dequeue()
    {
        if(head == null)
        {
            System.out.println("Queue Overflow.");
        }
        else
        {
            head = head.next;
            System.out.println("Node Deleted.");
        }
    }
    public  void  printQueue()
    {
        if(head == null)
        {
            System.out.println("Empty Queue.");
        }
        else
        {
            Node4 temp = head;
            while (temp!=null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
//            for(Node i = head; i!=null; i = i.next)
//            {
//                System.out.println(i.data);
//            }
        }
    }
    public void deleteQueue()
    {
        head = null;
        end = null;
        System.out.println("Queue Deleted.");
    }
}

class MyQueueLinkListMain
{
    public static void main(String[] args) {
        MyQueueLinkList obj = new MyQueueLinkList();
        Node4 n1 = new Node4(10);
        Node4 n2 = new Node4(20);
        Node4 n3 = new Node4(30);
        Node4 n4 = new Node4(40);
        Node4 n5 = new Node4(50);
        obj.enqueue(n1);
        obj.enqueue(n2);
        obj.enqueue(n3);
        obj.enqueue(n4);
        obj.enqueue(n5);
        obj.printQueue();
        obj.dequeue();
        obj.dequeue();
        obj.printQueue();
        obj.deleteQueue();
    }
}
