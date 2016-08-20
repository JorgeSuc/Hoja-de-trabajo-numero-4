/* Universidad del valle de Guatemala
   Algoritmos y estructura de Datos
   Hoja de trabajo 4
   
   Jose Ramirez 
   Jorge Suchite
   viernes 19 de agosto 2016
   Programon el de hoy */
package hdt4;

public class StackFactory<E> {
	public IStack<E> getStack(String entry) {
	    if(entry.equals("1"))
	        return new StackArrayList<E>();
	    if(entry.equals("2"))
	        return new StackVector<E>();
	    if(entry.equals("3"))
	        return new StackList<E>();
	    else 
	        return null;
	    }
}