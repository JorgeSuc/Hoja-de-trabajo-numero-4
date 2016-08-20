/* Universidad del valle de Guatemala
   Algoritmos y estructura de Datos
   Hoja de trabajo 4
   
   Jose Ramirez 
   Jorge Suchite
   viernes 19 de agosto 2016
   Programon el de hoy */
package hdt4;

public class ListFactory<E> {
    public IList<E> getList(String entry){
        if(entry.equals("1"))
            return new SingleLinkedList<E>();
        if(entry.equals("2"))
            return new DoubleLinkedList<E>();
        if(entry.equals("3"))
            return new CircularLinkedList<E>();
        else 
            return null;
    
    }
}