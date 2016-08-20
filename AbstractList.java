/* Universidad del valle de Guatemala
   Algoritmos y estructura de Datos
   Hoja de trabajo 4
   
   Jose Ramirez 
   Jorge Suchite
   viernes 19 de agosto 2016
   Programon el de hoy */
package hdt4;

public abstract class AbstractList<E> implements IList<E> {

	public AbstractList(){
		
	}
	
	public boolean IsEmpty(){
		return size() == 0;
	}
	
	public boolean contains(E value){
		return -1 !=indexOf(value);
	}
}