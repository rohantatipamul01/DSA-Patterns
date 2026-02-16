// 1) Implement Queue using Array

// Problem: Create a queue with operations: enqueue, dequeue, front, isEmpty.

// Test Case 1:
// Input: enqueue(10), enqueue(20), dequeue()
// Output: 10

// Test Case 2:
// Input: enqueue(5), front()
// Output: 5

package Queue;
import java.util.ArrayList;
import java.util.List;
public class Operations {
    public static void main(String args[])
    {
        List<Integer> queue=new ArrayList<>();
        // enqueue(queue, 10);
        // enqueue(queue, 20);
        // enqueue(queue, 30);
        // enqueue(queue, 40);
        // System.out.println("Dequeued element: " + dequeue(queue));
        System.out.println("Front element: " + front(queue));
        System.out.println("Is queue empty? " + isEmpty(queue));
        
    }
    static void enqueue(List<Integer> queue,int element)
    {
        queue.add(element);
    }
    static int dequeue(List<Integer> queue)
    {
        if(queue.isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue.remove(0);
    }
    static int front(List<Integer> queue)
    {
        if(queue.isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue.get(0);
    }
    static boolean isEmpty(List<Integer> queue)
    {
        return queue.isEmpty();
    }
    
}
