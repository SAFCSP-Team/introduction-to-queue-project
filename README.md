# Queue

### Objective

In this project, we will cover the fundamentals of the queue.

### Problem
Store invoice numbers of orders using a queue array.

### Implementation

Implement **QueueArray constructor, enqueue, and dequeue** methods.
 
> Run the main method to verify the implementation.

````Java
public class Main {
  /*add your code here*/
  public static void main(String[] args) {
      QueueArray que = new QueueArray();

      que.enqueue(100);
      que.enqueue(101);
      que.enqueue(102);

      que.dequeue();

      que.display();
    }
}
````
**OUTPUT**
````
101
102
````


> * Once you complete this project, Create an issue with the title "Completed [your-username]".
> * Please create an issue of your questions, If you have any trouble solving the project.
