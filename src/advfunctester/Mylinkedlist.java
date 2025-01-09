package advfunctester;
import javax.naming.OperationNotSupportedException;

/**
 * @author Dom
 * @date 12/16/2024
 * A representation of a linked list
 */

public class Mylinkedlist <T> {
    // Instance Variables
    private Node<T> head;

    public Mylinkedlist () {
        this.head = null;  // null can only mean empty
    }

     /**
     * Return whether or not our linked list is empty
     * @Return true when the list is empty; false otherwise
     */
    public boolean isEmpty() {
        return this.head == null;
    }

    /**
     * Add sone data to the beginning of the list
     * @param data the data to add 
     */
    public void prepend(T data) {
        Node<T> node = new Node<>(data);

        // Step 0: Is the list empty?
        if (isEmpty()) {
            this.head = node;
            return;
        }
        // Step 1: Make the "next" of this node point to the current list
        node.next = this.head;
        // Step 2: Make node the "head" of the list
        this.head = node;
    }

    /**
     * Add some data to the end of the list
     * @param data the data to add 
     */
    public void append(T data) {
        Node<T> node = new Node<>(data);

        // Step 0: Is the list empty?
        if (isEmpty()) {
            this.head = node;
            return;
        }

        // Step 1: Find the end of the list
        // 1a: Save the current state of head
        Node<T> current = this.head;
        // 1b. Find the node that has a "next" of "null"
        while (current.next != null) {
            // This traverses the list down to the end
            current = current.next;
        }
        // We know for sure that current's .next value HAS TO BE NULL
        // Add the node after the last element
        current.next = node;
    }

    public T getFirst() throws OperationNotSupportedException {
        if(isEmpty()){
            // exception (operation makes an error)
            throw new OperationNotSupportedException("No head on empty list");
            
        }

        return this.head.data;
    }

    public void removeFirst (){
        if(isEmpty()){
            return;
        }

        // remove the first element by setting the "head"
        // of the list to point to the "next" element
        this.head = this.head.next;
    }
    
    public int size(){
        int size= 1;
        Node<T> current = this.head;
        // 1b. Find the node that has a "next" of "null"
        while (current.next != null) {
            // This traverses the list down to the end
            current = current.next;
            size += 1;
        }
        return size;
    }

    public String toString() {
        // Step 0: Is the list empty?
        if (isEmpty()) {
            return "[]";
        }

        // Traverse the list, adding an element to our string at every node
        StringBuilder repr = new StringBuilder();  // Effecient string building
        repr.append("[ ");
        // Traverse 1: Set up current
        Node<T> current = this.head;
        // Traverse 2: Loop while current (or current.next) is not null
        while (current.next != null) {
            // Traverse 3: Do the thing
            repr.append(current.data);
            repr.append(" -> ");

            // Traverse 4: Go to next node
            current = current.next;
        }
        repr.append(current.data);
        repr.append(" ]");

        return repr.toString();
    }

    /**
     * A node class to make possilbe a "Singly-Linked-List"
     */
    private class Node <U> {
        private U data;
        private Node<U>  next;

        public Node(U data) {
            this.data = data;
        }
        
    }

}