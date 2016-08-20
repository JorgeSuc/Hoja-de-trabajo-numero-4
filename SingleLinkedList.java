/* Universidad del valle de Guatemala
   Algoritmos y estructura de Datos
   Hoja de trabajo 4
   
   Jose Ramirez 
   Jorge Suchite
   viernes 19 de agosto 2016
   Programon el de hoy */
package hdt4;

import java.util.Iterator;

public class SingleLinkedList<E> extends AbstractList<E>{
	
	protected int count; // list size
	protected Node<E> head; // ref. to first element

	public SingleLinkedList()
	// post: generates an empty list
	{
		head = null;
		count = 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return count==0;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public void addFirst(E value){
		// post: value is added to beginning of list
		// note order that things happen:
		// head is parameter, then assigned
		// TODO Auto-generated method stub
		head = new Node<E>(value,head);
		count++;
		
	}

	public void addLast(E value) {
		// post: adds value to end of list
		Node<E> newNode = new Node<E>(value, null); //creates the new node
		if (head != null){
			Node<E> finger = head;
			while (finger.next() != null){
				finger = finger.next();
			}
			finger.setNext(newNode);
		}
		else
			head = newNode;
		count++;
		
	}

	public E getFirst() {
		// pre: list is not empty
		// post: returns first value in list
		return head.value();
	}

	public E getLast() {
		// TODO Auto-generated method stub
		Node<E> newNode = new Node<E>(null); //creates the new node
		if (head != null){
			Node<E> finger = head;
			while (finger.next() != null){
				finger = finger.next();
			}
			return (E) finger;
		}else{
			return null;	
		}
		
	}

	public E removeFirst() {
		// pre: list is not empty
		// post: removes and returns value from beginning of list
		Node<E> temp = head;
		head = head.next();
		count--;
		return temp.value();
	}

	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	public E remove(E value) {
		// post: removes and returns element equal to value
		// otherwise returns null
		Node<E> finger = head;
		Node<E> previous = null;
		
		while (finger.next() != null && !finger.value().equals(value)){
			previous = finger;
			finger = finger.next();
		}
		
		if (finger != null){
			if (previous == null){
				head = finger.next();
			}
			else{
				previous.setNext(finger.next());
			}
			count--;
			return finger.value();
		}
		else
			return null; //didn't find it
	}

	public void add(E value) {
		// TODO Auto-generated method stub
		
	}

	public E remove() {
		
		return null;
	}

	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(E value) {
		// pre: value is not null
		// post: returns true iff value is found in list
		Node<E> finger = head;
		while (finger != null && !finger.value().equals(value))
			finger = finger.next();
		return finger != null;
	}

	
	/* (non-Javadoc)
	 * @see IList#indexOf(java.lang.Object)
	 */
	public int indexOf(E value) {
		  int indexOF = 0;
		  Node<E> finger = head;
		  
		  while (finger !=null)
		  { 
		    if (finger.equals(value))
		    {
		      return indexOF;
		    }
		    
		    indexOF++;
		    finger = finger.next();
		  }
		 return -1;
	}
	

	public int lastIndexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}

	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public E set(int i, E o) {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(int i, E o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		Node<E> finger = head;
		String cadena = "";
		while (finger.next() != null){
			cadena += finger.value()+" ";
			finger = finger.next();
		}
		return cadena;
	}
	
	

}