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

        // rear default value -1

        // intialize array
        
    }

    public boolean isEmpty() {
        // return True if array is Empty

    }

    public boolean isFull() {
        // return True if array is Full

    }

    public void enqueue(int element) {
        // add new element at the rear

    }

    public void dequeue() {
        // remove element at the front

    }

    public void display() {
        // temporary variable to print queue from front to rear
        int temp = front;
        for(int i = temp; i <= rear; i++) {

            System.out.println(array[i]);
        }
    }



}
