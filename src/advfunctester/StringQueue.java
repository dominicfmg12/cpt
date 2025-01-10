package advfunctester;
import javax.naming.OperationNotSupportedException;

/**
 * author: Dom
 * date: 01/09/2025
 * Queue with Strings
 */

public class StringQueue {
    private Mylinkedlist<String> queue;

    public StringQueue(){
        this.queue= new Mylinkedlist<String>();
    }

    public void enqueue(String data) {
        queue.append(data);
    }

    public String peek() throws OperationNotSupportedException {
        return queue.getFirst();
    }

    public String dequeue() throws OperationNotSupportedException {
        queue.removeFirst();
        return queue.getFirst();    
    }

    /**
     * Return a string representation of our Linked List
     */
    public String toString() {
        return queue.toString();
    }

   
}
