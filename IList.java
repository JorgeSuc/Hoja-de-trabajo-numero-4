/* Universidad del valle de Guatemala
   Algoritmos y estructura de Datos
   Hoja de trabajo 4
   
   Jose Ramirez 
   Jorge Suchite
   viernes 19 de agosto 2016
   Programon el de hoy */
package hdt4;
import java.util.Iterator;

public interface IList<E> {
   public int size();
   public boolean contains(E value);
   public int indexOf(E value);
   public int lastIndexOf(E value);
   public boolean IsEmpty();
   public void clear();
   public void addFirst(E value);
   public void addLast(E value);
   public E getFirst();
   public E remove(E value);
   public void add(E value);
   public E getLast();
   public E removeFirst();
   public E removeLast();
   public E remove();
   public E get();
   public E get(int i);
   public E set(int i, E o);
   public void add(int i, E o);
   public E remove(int i);
   public Iterator<E> iterator();

}