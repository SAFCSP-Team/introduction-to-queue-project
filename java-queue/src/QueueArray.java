public class QueueArray {

    int array[];
    // front

    // rear

    // size

    QueueArray(int size) {
        // update size
        // front default value
        // rear default value
        // intialize array
    }

    public boolean isEmpty() {
        // return True if array is Empty
    }

    public boolean isFull() {
        // return True if array is Fll
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
