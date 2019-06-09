package two;

import java.util.LinkedList;

public class Queue<T> {
	private  LinkedList<T> queue = new LinkedList<>();
	public void enQueue(T t) {
		queue.addLast(t);
	}
	public T deQueue() {
		return queue.removeFirst();
	}
	
	public T top() {
		return queue.getFirst();
	}
	public T end() {
		return queue.getLast();
	}
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	public boolean contain(T t) {
		return queue.contains(t);
	}
	public int lengths() {
		return queue.size();
	}

}
