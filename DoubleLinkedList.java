/* Universidad del valle de Guatemala
   Algoritmos y estructura de Datos
   Hoja de trabajo 4
   
   Jose Ramirez 
   Jorge Suchite
   viernes 19 de agosto 2016
   Programon el de hoy */
package hdt4;
import java.util.Iterator;

public class DoubleLinkedList<E> extends AbstractList<E> {
	
	private DoubleNode<E> head;
	private DoubleNode<E> tail;
	private int count;

	
	public DoubleLinkedList(DoubleNode<E> head, DoubleNode<E> tail, int count) {
		this.head = head;
		this.tail = tail;
		this.count = count;
	}


	public DoubleLinkedList() {
		count = 0;
		head = null; 
		tail = null;
	}

	public void addFirst(E value){
		head = new DoubleNode<E>(value, head, null);
		if (tail == null) tail = head;
		count++;
	}

	public DoubleNode<E> getHead() {
		return head;
	}
	
	public void setHead(DoubleNode<E> head) {
		this.head = head;
	}
	
	public DoubleNode<E> getTail() {
		return tail;
	}
	
	public void setTail(DoubleNode<E> tail) {
		this.tail = tail;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
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
	public E remove(E value) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void add(E value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int indexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int lastIndexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public E set(int i, E o) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void add(int i, E o) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public E remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	

}