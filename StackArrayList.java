/* Universidad del valle de Guatemala
   Algoritmos y estructura de Datos
   Hoja de trabajo 4
   
   Jose Ramirez 
   Jorge Suchite
   viernes 19 de agosto 2016
   Programon el de hoy */
package hdt4;

import java.util.ArrayList;

public class StackArrayList<E> extends AbstractStack<E>{
	protected ArrayList<E> data;

	public StackArrayList(){
	// post: constructs a new, empty stack
		data = new ArrayList<E>();
	}

	public void Push(E element){
	// post: the value is added to the stack
	//          will be popped next if no intervening push
		data.add(element);
	}

	public E Pop(){
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
		return data.remove(Size()-1);
	}

	public E Get(){
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
		return data.get(Size() - 1);
	}
	
	public int Size(){
	// post: returns the number of elements in the stack
		return data.size();
	}
  
	public boolean IsEmpty(){
	// post: returns true if and only if the stack is empty
		return Size() == 0;
	}
}