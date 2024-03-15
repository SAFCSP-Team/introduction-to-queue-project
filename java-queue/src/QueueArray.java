public class Queue {

    // Attributes
    Node front;
    Node rear;

    // Constructor
    public Queue() {
        this.front = null;
        this.rear = null;
    }

    // enqueue
    public void enqueue(int newData) {
        Node newNode = new Node(newData);
        if (rear != null){
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null){
            front = rear;
        }

    }
    // dequeue
    public void dequeue() {
        if(front == null){
            System.out.println("queue is empty");
            return;
        } 
        int data = front.data;
        front = front.next;
        System.out.println(data);
        
    }
    // display
    public void display() {
        Node x = front;
        while (x != null) {
            System.out.println(x.data);
            x = x.next; 
        }

    }
}
