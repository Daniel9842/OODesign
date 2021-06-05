package edu.escuelaing.arsw.OODesign.app;
/**
 * This class stores information about the nodes.
 * @author Portatil
 *
 * @param <T> is the value that each node stores
 */
public class LinkedListNode<T> {
	//this variable stores the value of the node.
	private T value;
	//this variable stores the next node in the list.
	private LinkedListNode<T> next;
	//this variable stores the previous node in the list.
	private LinkedListNode<T> prior;
	
/**
 * 	The constructor defines the value of the variables.
 * @param number is the value that the node will store
 */
	public LinkedListNode(T number) {
		value = number;
		next = null;
	}
	
/**
 * this method changes the value of the next node
 * @param nextNode is the next node in the list
 */
	public void setNext(LinkedListNode<T> nextNode) {
		next = nextNode;
	}
	
/**
 * this method changes the value of the previous node
 * @param priorNode is the previous node in the list
 */
	public void setPrior(LinkedListNode<T> priorNode) {
		prior = priorNode;
	}
/**
 * 	this method returns the value of the node
 * @return the value stored in the node
 */
	public T getValue() {
		return value;
	}
/**
 * 	this method returns the next node in the list
 * @return the next node in the list
 */
	public LinkedListNode<T> getNext() {
		return next;
	}
/**
 * 	this method returns the previous node in the list
 * @return the previous node in the list
 */
	public LinkedListNode<T> getPrior() {
		return prior;
	}
}
