package edu.escuelaing.arsw.OODesign.app;

public class LinkedListNode<T> {
	private T value;
	private LinkedListNode<T> next;
	private LinkedListNode<T> prior;
	
	public LinkedListNode(T t) {
		value = t;
		next = null;
	}
	
	public void setNext(LinkedListNode<T> nextNode) {
		next = nextNode;
	}
	
	public void setPrior(LinkedListNode<T> priorNode) {
		prior = priorNode;
	}
	
	public T getValue() {
		return value;
	}
	
	public LinkedListNode<T> getNext() {
		return next;
	}
	
	public LinkedListNode<T> getPrior() {
		return prior;
	}
}
