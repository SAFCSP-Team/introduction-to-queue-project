public class QueueArray {

    // queue array
    int array[];
    // front
    int front;
    // rear
    int rear;
    // size
    int size;

    // Initialize default values & array
    QueueArray(int size) {
        // update size
        this.size = size;
        // front default value -1
        this.front = -1;
        this.rear = -1;

        // rear default value -1

        // intialize array
        this.array = new int[size];
    }

    public boolean isEmpty() {
        if(this.front == -1 && this.rear == -1){
            return true;
        }else{
            return false;
        }

    }

    public boolean isFull() {
        if(this.array.length-1 == this.size){
            return true; 
        }
        return false;

    }

    public void enqueue(int element) {
         if(isFull()){
            System.out.println("Array is full");
            return;
         }else if(isEmpty()){
            this.front = 0;
            this.rear = 0;
         }else{
        this.rear +=1;
         }
         this.array[this.rear] = element;

    }

    public void dequeue() {
        if(isEmpty()){
            System.out.println("there ia no object to delete");
        }else if (front == rear){
           front = rear = -1;

        }else{
            this.front ++;
        }

    }

    public void display() {
        // temporary variable to print queue from front to rear
        int temp = front;
        for(int i = temp; i <= rear; i++) {

            System.out.println(array[i]);
        }
    }



}
