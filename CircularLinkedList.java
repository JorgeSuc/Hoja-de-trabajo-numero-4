/** Universidad del valle de Guatemala
   Algoritmos y estructura de Datos
   Hoja de trabajo 4
   
   Jose Ramirez 
   Jorge Suchite
   viernes 19 de agosto 2016
   Programon el de hoy */

package hdt4;

import java.util.Iterator;


public class CircularLinkedList<E> extends AbstractList<E> {
	private Node<E> tail;
	private int count;


public void CircularList()
{
    tail = null;
    count = 0;
}


public void add(E value)
{
    addFirst(value);
}


public void addFirst(E value)
{
    Node<E> temp = new Node<E>(value);
    if (tail == null) { // first value added
        tail = temp;
        tail.setNext(tail);
    } else { // element exists in list
        temp.setNext(tail.next());
        tail.setNext(temp);
    }
    count++;
}


public void addLast(E value)
{
    // new entry:
    addFirst(value);
    tail = tail.next();
}


public E getFirst()
{
    return tail.next().value();
}


public E getLast()
{
    return tail.value();
}


public E removeFirst()
{
    Node<E> temp = tail.next(); // ie. head of list
    if (tail == tail.next()) {
        tail = null;
    } else {
        tail.setNext(temp.next());
        temp.setNext(null); // helps clean things up; temp is free
    }
    count--;
    return temp.value();
}


public E removeLast()
{
    Node<E> finger = tail;
    while (finger.next() != tail) {
        finger = finger.next();
    }
    // finger now points to second-to-last value
    Node<E> temp = tail;
    if (finger == tail)
    {
        tail = null;
    } else {
        finger.setNext(tail.next());
        tail = finger;
    }
    count--;
    return temp.value();
}


public boolean contains(E value)
{
    if (tail == null) return false;

    Node<E> finger;
    finger = tail.next();
    while ((finger != tail) && (!finger.value().equals(value)))
    {
        finger = finger.next();
    }
    return finger.value().equals(value);
}


public E remove(E value)
{
    if (tail == null) return null;
    Node<E> finger = tail.next();
    Node<E> previous = tail;
    int compares;
    for (compares = 0;
         (compares < count) && (!finger.value().equals(value));
         compares++) 
    {
        previous = finger;
        finger = finger.next();
    }
    if (finger.value().equals(value)) {
        // an example of pigeon-hole principle
        if (tail == tail.next()) { tail = null; }
        else {
            if (finger == tail) tail = previous;
            previous.setNext(previous.next().next());
        }
        // finger value free
        finger.setNext(null); // to keep things disconnected
        count--;            // fewer elements
        return finger.value();
    } else return null;
}


public int size()
{
    return count;
}


public E get(int i)
{
    if (i >= size()) {
        return null;
    }
    Node<E> finger = tail.next();
    // search for ith element or end of list
    while (i > 0)
    {
        finger = finger.next();
        i--;
    }
  
    return finger.value();
}

/**
 * Accessor method for tail field
 */
private Node<E> getTail(){
    return tail;
}


public E set(int i, E o)
{
    if (i >= size()) return null;
    Node<E> finger = tail.next();
    // search for ith element or end of list
    while (i > 0)
    {
        finger = finger.next();
        i--;
    }
    // get old value, update new value
    E result = finger.value();
    finger.setValue(o);
    return result;
}


public void add(int i, E o)
{
    if (i == 0) addFirst(o);
    else if (i == size()) addLast(o);
    else {
        Node<E> previous = tail;
        Node<E> next = tail.next();
        while (i > 0)
        {
            previous = next;
            next = next.next();
            i--;
        }
        Node<E> current = new Node<E>(o,next);
        count++;
        previous.setNext(current);
    }
}


public E remove(int i)
{
    // if not in list, return nothing
    if (i == 0) return removeFirst();
    if (i == size()-1) return removeLast();
    Node<E> previous = tail;
    Node<E> finger = tail.next(); // ie. head
    // count to appropriate location
    while (i > 0)
    {
        i--;
        previous = finger;
        finger = finger.next();
    }
    // unlink finger'd object
    previous.setNext(finger.next());
    count--;
    return finger.value();
}


public int indexOf(E value)
{
    int i = 0;
    Node<E> finger = tail.next();
    // search for value or end of list, counting along way
    while (finger != null && !finger.value().equals(value))
    {
        if (finger == tail) { // we fall off list
            finger = null;
        } else {
            finger = finger.next();
        }
        i++;
    }
    // finger points to value, i is index
    if (finger == null)
    {   // value not found, return indicator
        return -1;
    } else {
        // value found, return index
        return i;
    }
}


public int lastIndexOf(E value)
{
    int result = -1;        // assume not found, return -1
    int i = 0;
    Node<E> finger = tail.next();
    // search for last matching value, result is desired index
    while (finger != null)
    {
        // a match? keep track of location
        if (finger.value().equals(value)) result = i;
        if (finger == tail) {
            finger = null;
        } else {
            finger = finger.next();
        }
        i++;
    }
    // return last match
    return result;
}

public boolean IsEmpty()
{
    return tail == null;
}


public void clear()
{
    count = 0;
    tail = null;
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
public Iterator<E> iterator() {
	// TODO Auto-generated method stub
	return null;
}


}