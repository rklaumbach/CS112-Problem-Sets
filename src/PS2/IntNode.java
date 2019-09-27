package PS2;

public class IntNode {
	public int data;
    public IntNode next;
    public IntNode(int data, IntNode next) {
        this.data = data; this.next = next;
    }
    public String toString() {
        return data + "";
    }
    
    public static IntNode addBefore(IntNode front, int target, int newItem) {
    	IntNode current = front;
    	IntNode newNode = (newItem, null);
    	
    	if(front.data == target) {
    		newNode.next = front;
    		front = newNode;
    		return front;
    	}
    	while (current.next.data != target && current.next != null) {
    		current = current.next;
    	}    	
    	if (current.next == null) {
    		return front;
    	}
    	newNode.next = current.next;
    	current.next = newNode;
    	return front;
    }
    
    
    
