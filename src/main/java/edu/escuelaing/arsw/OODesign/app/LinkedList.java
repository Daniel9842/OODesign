package edu.escuelaing.arsw.OODesign.app;

import java.io.Serializable;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 *this class performs functions to nodes
 *@author Daniel Santiago Ducuara Ardila
 */

public class LinkedList<E> implements List<E>, Deque<E>, Cloneable, Serializable {
//this variable represents the node at the top of the list
	private LinkedListNode<E> first;
//this variable represents the last node found in the list
	private LinkedListNode<E> last;
//this variable represents the size of the linkedList
	private int size;
/**
 * the constructor gives value to the created variables.
 */
	public LinkedList() {
		first = null;
		last = null;
		size = 0;
	}
	
	@Override
	public void addFirst(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLast(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean offerFirst(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offerLast(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pollLast() {
		// TODO Auto-generated method stub
		return null;
	}
/**
 *get the value of the leading node
 * @return the value stored by the node at the top
 */
	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return (E) first.getValue();
	}
/**
*get the value of the last node
* @return the value stored by the last node
*/
	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return (E) last.getValue();
	}

	@Override
	public E peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peekLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeFirstOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeLastOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offer(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
/**
 * this method checks if the list is empty
 * @return if the list is empty in Boolean
 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(first==null) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
/**
 * this method adds a new node
 * @param e is the value that the node stores
 * @return a boolean determined by the success of the
 */
	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			first = new LinkedListNode<E>(e);
			last = first;
			size+=1;
		}else {
			LinkedListNode<E> newNode = new LinkedListNode<E>(e);
			last.setNext(newNode);
			last = newNode;
			size+=1;
		}
		return true;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
/**
 * this method returns the value of the specified node.
 * @param index the value of the variable according to the chosen node. 
 * @return the value of a specific node.
 */
	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		int position=1;
		LinkedListNode<E> node = first;
		while(position<index && node.getNext()!=null) {
			node = node.getNext();
			position+=1;
		}
		return (E) node.getValue();
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
