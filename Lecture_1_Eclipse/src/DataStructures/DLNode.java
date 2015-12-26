package DataStructures;

public class DLNode<E> {
public E val;
public DLNode next,prev;
public DLNode(E data, DLNode next, DLNode prev) {
	this.next = next;
	this.prev = prev;
	val = data;
}
}
