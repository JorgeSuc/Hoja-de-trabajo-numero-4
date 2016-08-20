/** Universidad del valle de Guatemala
   Algoritmos y estructura de Datos
   Hoja de trabajo 4
   
   Jose Ramirez 
   Jorge Suchite
   viernes 19 de agosto 2016
   Programon el de hoy */
package hdt4;


public class DoubleNode<E> extends Node<E> {

	private DoubleNode<E> prevElement;
	
	
	
	public DoubleNode(E value) {
		super(value);
		prevElement = null;
	} 
	
	
	public DoubleNode(E value, DoubleNode<E> next, DoubleNode<E>prev){
		super(value, next);
		prevElement = prev;
	}
	

	public DoubleNode<E> getPrevElement() {
		return prevElement;
	}


	public void setPrevElemenet(DoubleNode<E> prevElement) {
		this.prevElement = prevElement;
	}

}