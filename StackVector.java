/* Universidad del valle de Guatemala
   Algoritmos y estructura de Datos
   Hoja de trabajo 4
   
   Jose Ramirez 
   Jorge Suchite
   viernes 19 de agosto 2016
   Programon el de hoy */
package hdt4;
import java.util.Vector;

public class StackVector<E> extends AbstractStack<E>{
	protected   Vector<E> data;
    	protected   int indice   = 0;
    
    	public StackVector(){
 	// pre: no se necesita
	// post: constructor de una pila
        	data = new Vector<E>();
    	}
    
    	public void Push(E element) {
        // pre: no se necesita
        // post: un nuevo dato se guarda en la pila
        	data.add(element);
    	}

	public E Pop() {    
        // pre: se realiza solamente si la pila tiene algun dato guardado
        // post: se saca de la pila el último dato guardado
        	E element = data.lastElement();
        	data.remove(data.size()-1);
        	return element;
    	}
    
    	public E Get() {
        // pre: se realiza solamente si la pila tiene algun dato guardado
        // post: indica cual ue el ultimo dato guardado
        	return data.get(Size() - 1);
    	}

    
    	public boolean IsEmpty() {
        // pre: no se necesita
        // post: devuelve true si la pila esta vacia y false si tiene algun dato guardado
        	return Size() == 0;
    	}

    	public int Size() {
        // pre: no se necesita
        // post: cuenta la cantidad de datos en la pila
        return data.size();
    	}
}