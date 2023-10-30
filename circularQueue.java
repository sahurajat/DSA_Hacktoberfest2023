
//wap to implement circular queue using array
public class two
{
    public static class queue
    {
        static int arr[];
        static int size;
        static int rear;
        static int front;
        queue(int n)
        {
            arr=new int[n];
            size=n;
            rear=-1;
           front=-1;

        }
         //isempty
         public static boolean isempty()
         {
             return rear == -1 && front==-1;
         }

         //isfull
         public static boolean isfull()
         {
             return (rear+1)%size == front;
         }
         //push
         public static void push(int data)
         {
            //check is queue is full or not
            if(isfull())
            {
                System.out.println("queue is full");
                return ;
            }

            //add 1st element
            if(front ==-1)
            {
                front=0;
            }
            rear=(rear+1) % size;
            arr[rear]=data;
         }
         //remove
         public static int remove()
         {
            //check is empty condition
            if(isempty())
            {
                System.out.println("queue is empty");
                return -1;
            }
            int result=arr[front];
            
           
            //if last element is present
            if(rear==front)
            {
                rear=front=-1;
            }
            else
            {
                front=(front+1)%size;
            }
            return result;
            
         }

         //peek function
         public static int peek()
         {
            //check is empty condition
            if(isempty())
            {
                System.out.println("queue is empty");
                return -1;
            }
           
            return arr[front];
         }

    }
    public static void main(String[] args)
    {
        queue q=new queue(4);
        q.push(6);
        q.push(7);
        q.push(8);
        q.push(9);

        System.out.println( q.remove());
        q.push(10);
          System.out.println( q.remove());
        q.push(11);

      
        
        while(! q.isempty())
        {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
