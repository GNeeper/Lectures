package DataStructures;

public class myStack<E> implements MyDeque<E> {
	private DLNode<E> head,tail;
	private int size;
	@Override
	public void push(E data) {
		DLNode<E> node = new DLNode(data,null,null);
		if (size == 0) {
			head = node;
			tail = node;
		}
		else {
			head.prev = node;
			node.next = head;
			head = node;
		}
		size++;
	}
	public E pop() {
		if (size == 0)
			return null;
		E value = head.val;
		head = head.next;
		head.prev = null;
		if (size == 1)
			tail = null;
		size--;
		return value;
	}
	@Override
	public E poll() {
		if (size == 0)
			return null;
		E value = tail.val;
		tail = tail.prev;
		tail.next = null;
		if (size == 1)
			head = null;
		size--;
		return value;
	}

	@Override
	public E peek() {
		E value = tail.val;
		return value;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void empty() {
		head = null;
		tail = null;
		size = 0;
	}

}
