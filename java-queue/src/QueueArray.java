public class queueArray {
    int [] queue;
    int front;
    int rear;
    int size;

    public queueArray(int size){
        queue = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }

    public void enqueue(int item){
        //if queue is full
        if (rear == size -1) {
            System.out.println("queue is full");
            return;
        }
        //if Q is empty
        if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
        }else{
            rear++;
        } 
        queue[rear] = item;
    }
    public void dequeue(){
        if(front == -1 && rear == -1){
            System.out.println("empty");

        }else if(front == 0 && rear == 0){
            rear = -1;
            front = -1;
        }else{
            front++;
        }
        
    }

    public void display() {
        // temporary variable to print queue from front to rear
        int temp = front;
        for(int i = temp; i <= rear; i++) {

            System.out.println(queue[i]);
        }
    }
    
}
